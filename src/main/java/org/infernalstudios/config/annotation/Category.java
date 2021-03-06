package org.infernalstudios.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies the category of all {@link org.infernalstudios.config.annotation.Configurable @Configurable} fields.
 * <p>
 * If a field has a specified category, it will be appended to this category.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Category {
    String value();
}
