package com.p051p1.mobile.putong.feed.newui.status.display.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.ksg;
import p153l.psd0;
import p153l.u3i;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateSquareEntranceView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareEntranceView f43763d;

    /* JADX INFO: renamed from: e */
    public VImage f43764e;

    /* JADX INFO: renamed from: f */
    public FeedAutoScrollView f43765f;

    /* JADX INFO: renamed from: g */
    public String f43766g;

    /* JADX INFO: renamed from: h */
    public boolean f43767h;

    public FeedStateSquareEntranceView(Context context) {
        super(context);
        this.f43767h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m66926B(View view) {
        i4g0.m138520r("e_state_explore", ksg.m151174K(this.f43766g, false));
        List<BubbleInfo> bubbleInfoLists = this.f43765f.getBubbleInfoLists();
        BubbleInfo bubbleInfo = bubbleInfoLists.get(this.f43765f.getCurrentIndex() % bubbleInfoLists.size());
        if (TextUtils.equals(bubbleInfo.value, "实时状态广场，发现更多有趣的人")) {
            bubbleInfo = null;
        }
        getContext().startActivity(FeedStatusPageAct.m66747s2(getContext(), true, bubbleInfo, ksg.m151174K(this.f43766g, false)));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m66929H(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (TextUtils.equals(str, ((BubbleInfo) list2.get(i2)).f39578id)) {
                    arrayList.add((BubbleInfo) list2.get(i2));
                }
            }
        }
        if (arrayList.size() == 0) {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            this.f43765f.setBubbleInfo(bubbleInfo);
        } else {
            this.f43765f.setBubbleInfoList(arrayList);
            this.f43765f.m66924p();
            if (this.f43767h) {
                return;
            }
            m66931L();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: I */
    public void m66930I(PhotoAlbumBaseFrag photoAlbumBaseFrag, StateSquareEntrance stateSquareEntrance, String str) {
        this.f43766g = str;
        final List<String> list = stateSquareEntrance.stateIds;
        List<BubbleInfo> bubbleInfoLists = this.f43765f.getBubbleInfoLists();
        if (bubbleInfoLists == null || bubbleInfoLists.size() <= 1) {
            if (jyb.m147479J(FeedModule.f39703d.f121387x0.m222761e())) {
                BubbleInfo bubbleInfo = new BubbleInfo();
                bubbleInfo.value = "实时状态广场，发现更多有趣的人";
                this.f43765f.setBubbleInfo(bubbleInfo);
            }
            photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.f121387x0).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.t3i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171922a.m66929H(list, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m66931L() {
        this.f43767h = true;
        i4g0.m138526x("e_state_explore", ksg.m151174K(this.f43766g, false));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m66932z(this);
        bnl0.m105509E0(this.f43763d, new View.OnClickListener() { // from class: l.s3i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166013a.m66926B(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m66932z(View view) {
        u3i.m194371a(this, view);
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43767h = false;
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43767h = false;
    }
}
