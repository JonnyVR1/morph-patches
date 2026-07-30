package com.p046p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.e30;
import p149l.mkd0;
import p149l.pgo;
import p149l.ufo;
import p149l.vwb;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersFrag extends PutongMvpFrag<ufo, pgo> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m39378S4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
            ((pgo) this.f17174A).m168877m0();
        } else {
            mo29638J4().m109035k();
        }
        ((pgo) this.f17174A).m168878n0(bool.booleanValue());
        ((ufo) this.f17175z).m193441V0(bool.booleanValue());
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ufo mo29641M4() {
        return new ufo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public pgo mo29642N4() {
        return new pgo(this);
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m39381R4() {
        return (act() == null || (act() instanceof IntlSeeAct)) ? false : true;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m39382T4(int i, int i2, Intent intent) {
        return ((ufo) this.f17175z).m193435O0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        if (m39381R4()) {
            this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(!xma.m210077h4())));
        } else {
            this.pageHelper.m109040p(vwb.m200311Y("see_entrance", (act() == null || act().getIntent() == null) ? null : act().getIntent().getStringExtra("from")));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.ueo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176054a.m39378S4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((pgo) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        p p;
        super.onHiddenChanged(z);
        v v2 = this.f17174A;
        if (v2 != 0) {
            ((pgo) v2).m168876l0(Boolean.valueOf(z));
        }
        p p2 = this.f17175z;
        if (p2 != 0) {
            ((ufo) p2).m193437Q0(Boolean.valueOf(z));
        }
        if (z || !m39381R4() || (p = this.f17175z) == 0) {
            return;
        }
        ((ufo) p).m193434N0(null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return m39381R4() ? "p_intl_meet_view" : "p_intl_plm";
    }
}
