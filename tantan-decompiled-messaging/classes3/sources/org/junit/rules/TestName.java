package org.junit.rules;

import org.junit.runner.Description;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TestName extends TestWatcher {
    private String name;

    public String getMethodName() {
        return this.name;
    }

    @Override // org.junit.rules.TestWatcher
    public void starting(Description description) {
        this.name = description.getMethodName();
    }
}
