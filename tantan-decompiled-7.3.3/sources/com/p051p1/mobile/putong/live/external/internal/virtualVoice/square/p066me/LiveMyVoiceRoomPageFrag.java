package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.p066me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import org.jetbrains.annotations.NotNull;
import p153l.fbv;
import p153l.hk4;
import p153l.jyb;
import p153l.kbv;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveMyVoiceRoomPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public kbv f46372A;

    /* JADX INFO: renamed from: z */
    public fbv f46373z;

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public static LiveBaseFrag m71080O4() {
        return new LiveMyVoiceRoomPageFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m71081P4(Bundle bundle) {
        this.f46373z.m124948A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        hk4 hk4Var = new hk4(this);
        hk4Var.m135618d("1002");
        this.f46373z = new fbv(this, hk4Var);
        kbv kbvVar = new kbv(this);
        this.f46372A = kbvVar;
        this.f46373z.mo52715C(kbvVar);
        creates(new y20() { // from class: l.n8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140711a.m71081P4((Bundle) obj);
            }
        }, new x20() { // from class: l.o8t
            @Override // p153l.x20
            public final void call() {
                this.f145466a.destroy();
            }
        });
        this.pageHelper.m152781p(jyb.m147494Y("audio_tab_id", hk4Var.m135615a()));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46372A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
