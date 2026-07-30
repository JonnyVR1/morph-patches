package org.junit.rules;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public interface MethodRule {
    Statement apply(Statement statement, FrameworkMethod frameworkMethod, Object obj);
}
