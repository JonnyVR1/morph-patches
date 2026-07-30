package com.bytedance.bpea.basics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m88121d2 = {"Lcom/bytedance/bpea/basics/CertChecker;", "", "check", "Lcom/bytedance/bpea/basics/CheckResult;", "cert", "Lcom/bytedance/bpea/basics/Cert;", "context", "Lcom/bytedance/bpea/basics/CertContext;", "basics_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public interface CertChecker {
    @NotNull
    CheckResult check(@Nullable Cert cert, @NotNull CertContext context) throws BPEAException;
}
