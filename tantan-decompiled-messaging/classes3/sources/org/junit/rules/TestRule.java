package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TestRule {
    Statement apply(Statement statement, Description description);
}
