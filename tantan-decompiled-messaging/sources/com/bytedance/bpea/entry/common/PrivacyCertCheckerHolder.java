package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.BPEALogUtil;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertChecker;
import com.bytedance.bpea.basics.CertContext;
import com.bytedance.bpea.basics.CheckResult;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m87232d2 = {"Lcom/bytedance/bpea/entry/common/PrivacyCertCheckerHolder;", "", "()V", "certChecker", "Lcom/bytedance/bpea/basics/CertChecker;", "check", "Lcom/bytedance/bpea/basics/CheckResult;", "cert", "Lcom/bytedance/bpea/basics/Cert;", "certContext", "Lcom/bytedance/bpea/basics/CertContext;", "common-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class PrivacyCertCheckerHolder {
    public static final PrivacyCertCheckerHolder INSTANCE = new PrivacyCertCheckerHolder();
    private static CertChecker certChecker;

    static {
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.core.checker.CertCheckerProvider");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            declaredField.getClass();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("CHECKER");
            declaredField2.getClass();
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.bpea.basics.CertChecker");
            }
            certChecker = (CertChecker) obj2;
            if (certChecker != null) {
                BPEALogUtil.INSTANCE.m5655d("checker working");
            } else {
                BPEALogUtil.INSTANCE.m5655d("checker not work");
            }
        } catch (Throwable unused) {
        }
    }

    private PrivacyCertCheckerHolder() {
    }

    @Nullable
    public final CheckResult check(@Nullable Cert cert, @NotNull CertContext certContext) throws BPEAException {
        certContext.getClass();
        CertChecker certChecker2 = certChecker;
        if (certChecker2 != null) {
            return certChecker2.check(cert, certContext);
        }
        return null;
    }
}
