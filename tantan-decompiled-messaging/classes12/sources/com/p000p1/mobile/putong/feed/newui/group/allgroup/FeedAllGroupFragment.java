package com.p000p1.mobile.putong.feed.newui.group.allgroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import p007l.hmg;
import p007l.img;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAllGroupFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public hmg f1438A;

    /* JADX INFO: renamed from: z */
    public img f1439z;

    /* JADX INFO: renamed from: M4 */
    public static FeedAllGroupFragment m2874M4(int i) {
        FeedAllGroupFragment feedAllGroupFragment = new FeedAllGroupFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i);
        feedAllGroupFragment.setArguments(bundle);
        return feedAllGroupFragment;
    }

    /* JADX INFO: renamed from: N4 */
    public void m2875N4() {
        this.f1439z = new img(this);
        hmg hmgVar = new hmg(this);
        this.f1438A = hmgVar;
        hmgVar.C(this.f1439z);
    }

    /* JADX INFO: renamed from: O4 */
    public hmg m2876O4() {
        if (this.f1438A == null) {
            m2875N4();
        }
        return this.f1438A;
    }

    /* JADX INFO: renamed from: P4 */
    public img m2877P4() {
        if (this.f1439z == null) {
            m2875N4();
        }
        return this.f1439z;
    }

    /* JADX INFO: renamed from: f4 */
    public void m2878f4() {
        super.f4();
        m2876O4().m10674a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m2879g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1439z.m10986d(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2877P4().inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m2880n4(Bundle bundle) {
        m2876O4().m10676i0();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    /* JADX INFO: renamed from: y4 */
    public void m2881y4() {
        this.f1439z.m10984b();
    }
}
