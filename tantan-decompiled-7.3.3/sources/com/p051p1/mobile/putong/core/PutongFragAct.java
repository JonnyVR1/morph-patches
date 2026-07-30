package com.p051p1.mobile.putong.core;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.PutongFragAct;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.afc0;
import p153l.odc0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/core/PutongFragAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initSubscription", "Lcom/p1/mobile/android/app/Frag;", "Y1", "()Lcom/p1/mobile/android/app/Frag;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class PutongFragAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static void m30951X1(PutongFragAct putongFragAct, Bundle bundle) {
        putongFragAct.fragmentManager().m2568m().m2812s(odc0.f146879r, putongFragAct.mo30952Y1()).mo2708i();
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public abstract Frag mo30952Y1();

    @Override // com.p051p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return inflater.inflate(afc0.f70899f, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (fragmentManager().m2555h0(odc0.f146879r) == null) {
            creates(new y20() { // from class: l.rrb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    PutongFragAct.m30951X1(this.f164565a, (Bundle) obj);
                }
            });
        }
    }
}
