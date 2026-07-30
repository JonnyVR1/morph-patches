package com.p000p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import l.d30;
import l.e30;
import l.fcm0;
import l.hfw;
import l.hu20;
import l.xun0;
import p002l.AbstractC0795r4;
import p002l.g4c;
import p002l.ho2;
import p002l.oqn0;
import p002l.wat;
import p002l.zgt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: z */
    public AbstractC0795r4 f3777z;

    public LiveFrag() {
        creates(new e30() { // from class: l.vds
            public final void call(Object obj) {
                this.f21093a.m5156Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.wds
            public final void call() {
                this.f21662a.m5157S4();
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static LiveFrag m5155O4(AnchorStartData anchorStartData) {
        LiveFrag liveFrag = new LiveFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LIVE_ANCHOR_START_DATA", anchorStartData);
        liveFrag.setArguments(bundle);
        return liveFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public void m5156Q4(Bundle bundle) {
        this.f3777z.mo21768P3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public void m5157S4() {
        AbstractC0795r4 abstractC0795r4 = this.f3777z;
        if (abstractC0795r4 != null) {
            abstractC0795r4.mo5949n();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final fcm0 m5158P4(ho2 ho2Var, AnchorStartData anchorStartData) {
        if (!(ho2Var instanceof fcm0)) {
            return new fcm0(new oqn0(), new zgt(anchorStartData.anchorSource));
        }
        fcm0 fcm0Var = (fcm0) ho2Var;
        if (ho2Var.m14503H0() != null) {
            hfw.a("[live][voice]", "" + ho2Var.m14503H0().hashCode());
        }
        return fcm0Var;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m5159R4(AnchorStartData anchorStartData) {
        this.f3777z = new xun0(this, anchorStartData, m5158P4((anchorStartData == null || !anchorStartData.isFromFloatWindow) ? null : g4c.m13625a().m13626b(), anchorStartData));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public void m5160d4() {
        super.d4();
        hu20.p("context_square");
        hu20.p("context_common");
        hu20.p("context_live_activities");
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
            m5159R4(anchorStartData);
        } else {
            this.f3777z = new wat(this, str, anchorStartData);
        }
        this.f3777z.m25547E2().m17246w(anchorStartData.traceId);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3777z.mo21766N3();
    }

    /* JADX INFO: renamed from: o */
    public boolean m5161o() {
        return this.f3777z.mo21769o();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        this.f3777z.mo21767O3(i, i2, intent);
    }
}
