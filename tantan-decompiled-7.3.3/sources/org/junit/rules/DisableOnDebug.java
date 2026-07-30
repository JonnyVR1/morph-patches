package org.junit.rules;

import java.lang.management.ManagementFactory;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public class DisableOnDebug implements TestRule {
    private final boolean debugging;
    private final TestRule rule;

    public DisableOnDebug(TestRule testRule) {
        this(testRule, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    private static boolean isDebugging(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return this.debugging ? statement : this.rule.apply(statement, description);
    }

    public DisableOnDebug(TestRule testRule, List<String> list) {
        this.rule = testRule;
        this.debugging = isDebugging(list);
    }

    public boolean isDebugging() {
        return this.debugging;
    }
}
