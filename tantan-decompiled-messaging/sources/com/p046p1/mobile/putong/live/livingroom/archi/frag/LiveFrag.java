package com.p046p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import p149l.AbstractC19634r4;
import p149l.d30;
import p149l.e30;
import p149l.fcm0;
import p149l.g4c;
import p149l.hfw;
import p149l.ho2;
import p149l.hu20;
import p149l.oqn0;
import p149l.wat;
import p149l.xun0;
import p149l.zgt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: z */
    public AbstractC19634r4 f47735z;

    public LiveFrag() {
        creates(new e30() { // from class: l.vds
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181118a.m71788Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.wds
            @Override // p149l.d30
            public final void call() {
                this.f185858a.m71789S4();
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static LiveFrag m71787O4(AnchorStartData anchorStartData) {
        LiveFrag liveFrag = new LiveFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LIVE_ANCHOR_START_DATA", anchorStartData);
        liveFrag.setArguments(bundle);
        return liveFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public void m71788Q4(Bundle bundle) {
        this.f47735z.mo177750P3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public void m71789S4() {
        AbstractC19634r4 abstractC19634r4 = this.f47735z;
        if (abstractC19634r4 != null) {
            abstractC19634r4.mo69117n();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final fcm0 m71790P4(ho2 ho2Var, AnchorStartData anchorStartData) {
        if (!(ho2Var instanceof fcm0)) {
            return new fcm0(new oqn0(), new zgt(anchorStartData.anchorSource));
        }
        fcm0 fcm0Var = (fcm0) ho2Var;
        if (ho2Var.m132067H0() != null) {
            hfw.m130790a("[live][voice]", "" + ho2Var.m132067H0().hashCode());
        }
        return fcm0Var;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m71791R4(AnchorStartData anchorStartData) {
        this.f47735z = new xun0(this, anchorStartData, m71790P4((anchorStartData == null || !anchorStartData.isFromFloatWindow) ? null : g4c.m124360a().m124361b(), anchorStartData));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2, l.lh20] */
    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        hu20.m132970p("context_square");
        hu20.m132970p("context_common");
        hu20.m132970p("context_live_activities");
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        AnchorStartData anchorStartData = (AnchorStartData) arguments.getSerializable("LIVE_ANCHOR_START_DATA");
        String str = anchorStartData.anchorSource;
        String str2 = anchorStartData.type;
        if (str2 == null) {
            str2 = "type_normal_live";
        }
        if (str2.equals("type_voice_live")) {
            m71791R4(anchorStartData);
        } else {
            this.f47735z = new wat(this, str, anchorStartData);
        }
        this.f47735z.m206027E2().m149825w(anchorStartData.traceId);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47735z.mo177748N3();
    }

    /* JADX INFO: renamed from: o */
    public boolean m71792o() {
        return this.f47735z.mo177751o();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f47735z.mo177749O3(i, i2, intent);
    }
}
