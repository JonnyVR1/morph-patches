package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.dac0;
import p149l.t6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d */
/* JADX INFO: loaded from: classes4.dex */
public class C12737d extends dac0<BLiveStickerMetaDataItem> {

    /* JADX INFO: renamed from: c */
    public final Act f48731c;

    /* JADX INFO: renamed from: d */
    public a f48732d;

    /* JADX INFO: renamed from: e */
    public final boolean f48733e;

    /* JADX INFO: renamed from: f */
    public List<BLiveStickerMetaDataItem> f48734f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo72477a(LiveStickerMenuItem liveStickerMenuItem);
    }

    public C12737d(Act act, boolean z) {
        this.f48731c = act;
        this.f48733e = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<BLiveStickerMetaDataItem> list = this.f48734f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        final LiveStickerMenuItem liveStickerMenuItem = (LiveStickerMenuItem) this.f48731c.inflater().inflate(t6c0.f168229W5, viewGroup, false);
        liveStickerMenuItem.m72324d(this.f48733e);
        liveStickerMenuItem.setOnClickListener(new View.OnClickListener() { // from class: l.nwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140945a.m72474H(liveStickerMenuItem, view);
            }
        });
        return liveStickerMenuItem;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveStickerMetaDataItem bLiveStickerMetaDataItem, int i, int i2) {
        ((LiveStickerMenuItem) view).m72326f(bLiveStickerMetaDataItem, this);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveStickerMetaDataItem getItem(int i) {
        List<BLiveStickerMetaDataItem> list = this.f48734f;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m72474H(LiveStickerMenuItem liveStickerMenuItem, View view) {
        a aVar = this.f48732d;
        if (aVar != null) {
            aVar.mo72477a(liveStickerMenuItem);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m72475I(a aVar) {
        this.f48732d = aVar;
    }

    /* JADX INFO: renamed from: J */
    public void m72476J(List<BLiveStickerMetaDataItem> list) {
        this.f48734f = list;
        notifyDataSetChanged();
    }

    public <V> C22306c<V> duringCreated(C22306c<V> c22306c) {
        return mo67374c(this.f48731c, c22306c);
    }
}
