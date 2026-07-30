package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.jic0;
import p153l.yec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d */
/* JADX INFO: loaded from: classes4.dex */
public class C12900d extends jic0<BLiveStickerMetaDataItem> {

    /* JADX INFO: renamed from: c */
    public final Act f49579c;

    /* JADX INFO: renamed from: d */
    public a f49580d;

    /* JADX INFO: renamed from: e */
    public final boolean f49581e;

    /* JADX INFO: renamed from: f */
    public List<BLiveStickerMetaDataItem> f49582f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo73660a(LiveStickerMenuItem liveStickerMenuItem);
    }

    public C12900d(Act act, boolean z) {
        this.f49579c = act;
        this.f49581e = z;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<BLiveStickerMetaDataItem> list = this.f49582f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        final LiveStickerMenuItem liveStickerMenuItem = (LiveStickerMenuItem) this.f49579c.inflater().inflate(yec0.f198961W5, viewGroup, false);
        liveStickerMenuItem.m73507d(this.f49581e);
        liveStickerMenuItem.setOnClickListener(new View.OnClickListener() { // from class: l.x4g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192410a.m73657H(liveStickerMenuItem, view);
            }
        });
        return liveStickerMenuItem;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveStickerMetaDataItem bLiveStickerMetaDataItem, int i, int i2) {
        ((LiveStickerMenuItem) view).m73509f(bLiveStickerMetaDataItem, this);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveStickerMetaDataItem getItem(int i) {
        List<BLiveStickerMetaDataItem> list = this.f49582f;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m73657H(LiveStickerMenuItem liveStickerMenuItem, View view) {
        a aVar = this.f49580d;
        if (aVar != null) {
            aVar.mo73660a(liveStickerMenuItem);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m73658I(a aVar) {
        this.f49580d = aVar;
    }

    /* JADX INFO: renamed from: J */
    public void m73659J(List<BLiveStickerMetaDataItem> list) {
        this.f49582f = list;
        notifyDataSetChanged();
    }

    public <V> C22421c<V> duringCreated(C22421c<V> c22421c) {
        return mo68557c(this.f49579c, c22421c);
    }
}
