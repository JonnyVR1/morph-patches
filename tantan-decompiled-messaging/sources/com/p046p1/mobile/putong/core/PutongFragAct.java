package com.p046p1.mobile.putong.core;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.PutongFragAct;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.i5c0;
import p149l.v6c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/core/PutongFragAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initSubscription", "Lcom/p1/mobile/android/app/Frag;", "X1", "()Lcom/p1/mobile/android/app/Frag;", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class PutongFragAct extends PutongAct {
    /* JADX INFO: renamed from: V1 */
    public static void m29953V1(PutongFragAct putongFragAct, Bundle bundle) {
        putongFragAct.fragmentManager().m2567m().m2811s(i5c0.f111557r, putongFragAct.mo29954X1()).mo2707i();
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public abstract Frag mo29954X1();

    @Override // com.p046p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return inflater.inflate(v6c0.f180183f, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (fragmentManager().m2554h0(i5c0.f111557r) == null) {
            creates(new e30() { // from class: l.njb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    PutongFragAct.m29953V1(this.f139224a, (Bundle) obj);
                }
            });
        }
    }
}
