package com.p051p1.mobile.putong.feed.newui.group.allgroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.wng;
import p153l.xng;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAllGroupFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public wng f40825A;

    /* JADX INFO: renamed from: z */
    public xng f40826z;

    /* JADX INFO: renamed from: M4 */
    public static FeedAllGroupFragment m63087M4(int i) {
        FeedAllGroupFragment feedAllGroupFragment = new FeedAllGroupFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i);
        feedAllGroupFragment.setArguments(bundle);
        return feedAllGroupFragment;
    }

    /* JADX INFO: renamed from: N4 */
    public void m63088N4() {
        this.f40826z = new xng(this);
        wng wngVar = new wng(this);
        this.f40825A = wngVar;
        wngVar.mo52715C(this.f40826z);
    }

    /* JADX INFO: renamed from: O4 */
    public wng m63089O4() {
        if (this.f40825A == null) {
            m63088N4();
        }
        return this.f40825A;
    }

    /* JADX INFO: renamed from: P4 */
    public xng m63090P4() {
        if (this.f40826z == null) {
            m63088N4();
        }
        return this.f40826z;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m63089O4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f40826z.m212206d(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63090P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        m63089O4().m207204i0();
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        this.f40826z.m212204b();
    }
}
