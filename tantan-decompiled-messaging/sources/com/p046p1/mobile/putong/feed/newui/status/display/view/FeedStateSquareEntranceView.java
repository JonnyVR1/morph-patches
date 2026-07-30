package com.p046p1.mobile.putong.feed.newui.status.display.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VRelative;
import p149l.e30;
import p149l.f2i;
import p149l.mkd0;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateSquareEntranceView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareEntranceView f42915d;

    /* JADX INFO: renamed from: e */
    public VImage f42916e;

    /* JADX INFO: renamed from: f */
    public FeedAutoScrollView f42917f;

    /* JADX INFO: renamed from: g */
    public String f42918g;

    /* JADX INFO: renamed from: h */
    public boolean f42919h;

    public FeedStateSquareEntranceView(Context context) {
        super(context);
        this.f42919h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m65743B(View view) {
        zvf0.m220396r("e_state_explore", vqg.m199515K(this.f42918g, false));
        List<BubbleInfo> bubbleInfoLists = this.f42917f.getBubbleInfoLists();
        BubbleInfo bubbleInfo = bubbleInfoLists.get(this.f42917f.getCurrentIndex() % bubbleInfoLists.size());
        if (TextUtils.equals(bubbleInfo.value, "实时状态广场，发现更多有趣的人")) {
            bubbleInfo = null;
        }
        getContext().startActivity(FeedStatusPageAct.m65563r2(getContext(), true, bubbleInfo, vqg.m199515K(this.f42918g, false)));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m65746H(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (TextUtils.equals(str, ((BubbleInfo) list2.get(i2)).f38730id)) {
                    arrayList.add((BubbleInfo) list2.get(i2));
                }
            }
        }
        if (arrayList.size() == 0) {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            this.f42917f.setBubbleInfo(bubbleInfo);
        } else {
            this.f42917f.setBubbleInfoList(arrayList);
            this.f42917f.m65741p();
            if (this.f42919h) {
                return;
            }
            m65748L();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: I */
    public void m65747I(PhotoAlbumBaseFrag photoAlbumBaseFrag, StateSquareEntrance stateSquareEntrance, String str) {
        this.f42918g = str;
        final List<String> list = stateSquareEntrance.stateIds;
        List<BubbleInfo> bubbleInfoLists = this.f42917f.getBubbleInfoLists();
        if (bubbleInfoLists == null || bubbleInfoLists.size() <= 1) {
            if (vwb.m200296J(FeedModule.f38855d.f193077x0.m221515e())) {
                BubbleInfo bubbleInfo = new BubbleInfo();
                bubbleInfo.value = "实时状态广场，发现更多有趣的人";
                this.f42917f.setBubbleInfo(bubbleInfo);
            }
            photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.f193077x0).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.e2i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88921a.m65746H(list, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m65748L() {
        this.f42919h = true;
        zvf0.m220402x("e_state_explore", vqg.m199515K(this.f42918g, false));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m65749z(this);
        xdl0.m208329E0(this.f42915d, new View.OnClickListener() { // from class: l.d2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83387a.m65743B(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m65749z(View view) {
        f2i.m119184a(this, view);
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42919h = false;
    }

    public FeedStateSquareEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42919h = false;
    }
}
