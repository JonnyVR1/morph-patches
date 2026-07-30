package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.p061me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import org.jetbrains.annotations.NotNull;
import p149l.d30;
import p149l.e30;
import p149l.e9v;
import p149l.ij4;
import p149l.j9v;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMyVoiceRoomPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public j9v f45524A;

    /* JADX INFO: renamed from: z */
    public e9v f45525z;

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public static LiveBaseFrag m69897O4() {
        return new LiveMyVoiceRoomPageFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m69898P4(Bundle bundle) {
        this.f45525z.m115394A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        ij4 ij4Var = new ij4(this);
        ij4Var.m136507d("1002");
        this.f45525z = new e9v(this, ij4Var);
        j9v j9vVar = new j9v(this);
        this.f45524A = j9vVar;
        this.f45525z.mo51532C(j9vVar);
        creates(new e30() { // from class: l.m6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131762a.m69898P4((Bundle) obj);
            }
        }, new d30() { // from class: l.n6t
            @Override // p149l.d30
            public final void call() {
                this.f137442a.destroy();
            }
        });
        this.pageHelper.m109040p(vwb.m200311Y("audio_tab_id", ij4Var.m136504a()));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45524A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
