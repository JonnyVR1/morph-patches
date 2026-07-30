package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RuleMemberValidator {
    public static final RuleMemberValidator CLASS_RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator CLASS_RULE_VALIDATOR;
    public static final RuleMemberValidator RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator RULE_VALIDATOR;
    private final Class<? extends Annotation> annotation;
    private final boolean methods;
    private final List<RuleValidator> validatorStrategies;

    public static class Builder {
        private final Class<? extends Annotation> annotation;
        private boolean methods;
        private final List<RuleValidator> validators;

        private Builder(Class<? extends Annotation> cls) {
            this.annotation = cls;
            this.methods = false;
            this.validators = new ArrayList();
        }

        public RuleMemberValidator build() {
            return new RuleMemberValidator(this);
        }

        public Builder forMethods() {
            this.methods = true;
            return this;
        }

        public Builder withValidator(RuleValidator ruleValidator) {
            this.validators.add(ruleValidator);
            return this;
        }
    }

    public static final class DeclaringClassMustBePublic implements RuleValidator {
        private DeclaringClassMustBePublic() {
        }

        private boolean isDeclaringClassPublic(FrameworkMember<?> frameworkMember) {
            return Modifier.isPublic(frameworkMember.getDeclaringClass().getModifiers());
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (isDeclaringClassPublic(frameworkMember)) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must be declared in a public class."));
        }
    }

    public static final class FieldMustBeARule implements RuleValidator {
        private FieldMustBeARule() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.isRuleType(frameworkMember)) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must implement MethodRule or TestRule."));
        }
    }

    public static final class FieldMustBeATestRule implements RuleValidator {
        private FieldMustBeATestRule() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.isTestRule(frameworkMember)) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must implement TestRule."));
        }
    }

    public static final class MemberMustBeNonStaticOrAlsoClassRule implements RuleValidator {
        private MemberMustBeNonStaticOrAlsoClassRule() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean zIsMethodRule = RuleMemberValidator.isMethodRule(frameworkMember);
            boolean z = frameworkMember.getAnnotation(ClassRule.class) != null;
            if (frameworkMember.isStatic()) {
                if (zIsMethodRule || !z) {
                    list.add(new ValidationError(frameworkMember, cls, RuleMemberValidator.isMethodRule(frameworkMember) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
                }
            }
        }
    }

    public static final class MemberMustBePublic implements RuleValidator {
        private MemberMustBePublic() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isPublic()) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must be public."));
        }
    }

    public static final class MemberMustBeStatic implements RuleValidator {
        private MemberMustBeStatic() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isStatic()) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must be static."));
        }
    }

    public static final class MethodMustBeARule implements RuleValidator {
        private MethodMustBeARule() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.isRuleType(frameworkMember)) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must return an implementation of MethodRule or TestRule."));
        }
    }

    public static final class MethodMustBeATestRule implements RuleValidator {
        private MethodMustBeATestRule() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.RuleValidator
        public void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.isTestRule(frameworkMember)) {
                return;
            }
            list.add(new ValidationError(frameworkMember, cls, "must return an implementation of TestRule."));
        }
    }

    public interface RuleValidator {
        void validate(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        CLASS_RULE_VALIDATOR = classRuleValidatorBuilder().withValidator(new DeclaringClassMustBePublic()).withValidator(new MemberMustBeStatic()).withValidator(new MemberMustBePublic()).withValidator(new FieldMustBeATestRule()).build();
        RULE_VALIDATOR = testRuleValidatorBuilder().withValidator(new MemberMustBeNonStaticOrAlsoClassRule()).withValidator(new MemberMustBePublic()).withValidator(new FieldMustBeARule()).build();
        CLASS_RULE_METHOD_VALIDATOR = classRuleValidatorBuilder().forMethods().withValidator(new DeclaringClassMustBePublic()).withValidator(new MemberMustBeStatic()).withValidator(new MemberMustBePublic()).withValidator(new MethodMustBeATestRule()).build();
        RULE_METHOD_VALIDATOR = testRuleValidatorBuilder().forMethods().withValidator(new MemberMustBeNonStaticOrAlsoClassRule()).withValidator(new MemberMustBePublic()).withValidator(new MethodMustBeARule()).build();
    }

    public RuleMemberValidator(Builder builder) {
        this.annotation = builder.annotation;
        this.methods = builder.methods;
        this.validatorStrategies = builder.validators;
    }

    private static Builder classRuleValidatorBuilder() {
        return new Builder(ClassRule.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMethodRule(FrameworkMember<?> frameworkMember) {
        return MethodRule.class.isAssignableFrom(frameworkMember.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRuleType(FrameworkMember<?> frameworkMember) {
        return isMethodRule(frameworkMember) || isTestRule(frameworkMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTestRule(FrameworkMember<?> frameworkMember) {
        return TestRule.class.isAssignableFrom(frameworkMember.getType());
    }

    private static Builder testRuleValidatorBuilder() {
        return new Builder(Rule.class);
    }

    private void validateMember(FrameworkMember<?> frameworkMember, List<Throwable> list) {
        Iterator<RuleValidator> it = this.validatorStrategies.iterator();
        while (it.hasNext()) {
            it.next().validate(frameworkMember, this.annotation, list);
        }
    }

    public void validate(TestClass testClass, List<Throwable> list) {
        boolean z = this.methods;
        Class<? extends Annotation> cls = this.annotation;
        Iterator it = (z ? testClass.getAnnotatedMethods(cls) : testClass.getAnnotatedFields(cls)).iterator();
        while (it.hasNext()) {
            validateMember((FrameworkMember) it.next(), list);
        }
    }
}
