package com.p000p1.mobile.putong.core;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.PutongFragAct;
import com.p1.mobile.android.app.Frag;
import kotlin.Metadata;
import l.e30;
import l.i5c0;
import l.v6c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/p1/mobile/putong/core/PutongFragAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initSubscription", "Lcom/p1/mobile/android/app/Frag;", "X1", "()Lcom/p1/mobile/android/app/Frag;", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PutongFragAct extends PutongAct {
    /* JADX INFO: renamed from: V1 */
    public static void m1881V1(PutongFragAct putongFragAct, Bundle bundle) {
        putongFragAct.fragmentManager().m().s(i5c0.r, putongFragAct.mo1882X1()).i();
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public abstract Frag mo1882X1();

    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return inflater.inflate(v6c0.f, (ViewGroup) null);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        if (fragmentManager().h0(i5c0.r) == null) {
            creates(new e30() { // from class: l.njb0
                public final void call(Object obj) {
                    PutongFragAct.m1881V1(this.f17705a, (Bundle) obj);
                }
            });
        }
    }
}
