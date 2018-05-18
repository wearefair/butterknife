package butterknife;

import android.support.annotation.StringRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS) @Target(FIELD)
/**
 * The annotation contains two values:
 * @value the default key for use from the remote server, it is value for the annotation.
 * @modularKey the modular key override
 */
public @interface BindFairString {
    @StringRes int value() default 0;
    String modularKey() default "";
}