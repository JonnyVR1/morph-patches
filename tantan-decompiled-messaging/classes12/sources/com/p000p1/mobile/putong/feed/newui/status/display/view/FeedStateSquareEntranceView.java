package com.p000p1.mobile.putong.feed.newui.status.display.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.f2i;
import p007l.vqg;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateSquareEntranceView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareEntranceView f4376d;

    /* JADX INFO: renamed from: e */
    public VImage f4377e;

    /* JADX INFO: renamed from: f */
    public FeedAutoScrollView f4378f;

    /* JADX INFO: renamed from: g */
    public String f4379g;

    /* JADX INFO: renamed from: h */
    public boolean f4380h;

    public FeedStateSquareEntranceView(Context context) {
        super(context);
        this.f4380h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m6889B(View view) {
        zvf0.r("e_state_explore", vqg.m15485K(this.f4379g, false));
        List<BubbleInfo> bubbleInfoLists = this.f4378f.getBubbleInfoLists();
        BubbleInfo bubbleInfo = bubbleInfoLists.get(this.f4378f.getCurrentIndex() % bubbleInfoLists.size());
        if (TextUtils.equals(bubbleInfo.value, "实时状态广场，发现更多有趣的人")) {
            bubbleInfo = null;
        }
        getContext().startActivity(FeedStatusPageAct.m6690r2(getContext(), true, bubbleInfo, vqg.m15485K(this.f4379g, false)));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6892H(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (TextUtils.equals(str, ((BubbleInfo) list2.get(i2)).f191id)) {
                    arrayList.add((BubbleInfo) list2.get(i2));
                }
            }
        }
        if (arrayList.size() == 0) {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            this.f4378f.setBubbleInfo(bubbleInfo);
        } else {
            this.f4378f.setBubbleInfoList(arrayList);
            this.f4378f.m6887p();
            if (this.f4380h) {
                return;
            }
            m6894L();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: I */
    public void m6893I(PhotoAlbumBaseFrag photoAlbumBaseFrag, StateSquareEntrance stateSquareEntrance, String str) {
        this.f4379g = str;
        final List<String> list = stateSquareEntrance.stateIds;
        List<BubbleInfo> bubbleInfoLists = this.f4378f.getBubbleInfoLists();
        if (bubbleInfoLists == null || bubbleInfoLists.size() <= 1) {
            if (vwb.J((List) FeedModule.f316d.f15012x0.e())) {
                BubbleInfo bubbleInfo = new BubbleInfo();
                bubbleInfo.value = "实时状态广场，发现更多有趣的人";
                this.f4378f.setBubbleInfo(bubbleInfo);
            }
            photoAlbumBaseFrag.duringCreated(FeedModule.f316d.f15012x0).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.e2i
                public final void call(Object obj) {
                    this.f7177a.m6892H(list, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m6894L() {
        this.f4380h = true;
        zvf0.x("e_state_explore", vqg.m15485K(this.f4379g, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m6895z(this);
        xdl0.E0(this.f4376d, new View.OnClickListener() { // from class: l.d2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6782a.m6889B(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m6895z(View view) {
        f2i.m9995a(this, view);
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4380h = false;
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4380h = false;
    }
}
