package com.p046p1.mobile.putong.feed.newui.group.allgroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.hmg;
import p149l.img;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAllGroupFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public hmg f39977A;

    /* JADX INFO: renamed from: z */
    public img f39978z;

    /* JADX INFO: renamed from: M4 */
    public static FeedAllGroupFragment m61904M4(int i) {
        FeedAllGroupFragment feedAllGroupFragment = new FeedAllGroupFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i);
        feedAllGroupFragment.setArguments(bundle);
        return feedAllGroupFragment;
    }

    /* JADX INFO: renamed from: N4 */
    public void m61905N4() {
        this.f39978z = new img(this);
        hmg hmgVar = new hmg(this);
        this.f39977A = hmgVar;
        hmgVar.mo51532C(this.f39978z);
    }

    /* JADX INFO: renamed from: O4 */
    public hmg m61906O4() {
        if (this.f39977A == null) {
            m61905N4();
        }
        return this.f39977A;
    }

    /* JADX INFO: renamed from: P4 */
    public img m61907P4() {
        if (this.f39978z == null) {
            m61905N4();
        }
        return this.f39978z;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m61906O4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f39978z.m137073d(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m61907P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        m61906O4().m131729i0();
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        this.f39978z.m137071b();
    }
}
