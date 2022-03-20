/*
 * Copyright 2022 Infernal Studios
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.infernalstudios.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.infernalstudios.config.element.handler.IConfigElementHandler;

/**
 * Specifies that this field is now configurable by the config system
 */
@Target({ ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Configurable {

    /**
     * The translation key of this field. If this is not specified, the field name is used.
     */
    String translationKey() default "";

    /**
     * The description of this field.
     */
    String description() default "";
    
    /**
     * The category this field is in. If this is not specified, the field name is used.
     */
    String category() default "";

    /**
     * Any custom tags to the field for any custom functionality.
     */
    String[] tags() default {};

    /**
     * A custom handler for this field. If this is not specified, the default handler is used.
     * The class must have a public static INSTANCE field.
     */
    @SuppressWarnings("rawtypes")
    Class handler() default IConfigElementHandler.class;
}
