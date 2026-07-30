package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import p002l.t6c0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0326d extends dac0<BLiveStickerMetaDataItem> {

    /* JADX INFO: renamed from: c */
    public final Act f4773c;

    /* JADX INFO: renamed from: d */
    public a f4774d;

    /* JADX INFO: renamed from: e */
    public final boolean f4775e;

    /* JADX INFO: renamed from: f */
    public List<BLiveStickerMetaDataItem> f4776f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5965a(LiveStickerMenuItem liveStickerMenuItem);
    }

    public C0326d(Act act, boolean z) {
        this.f4773c = act;
        this.f4775e = z;
    }

    /* JADX INFO: renamed from: C */
    public int m5958C() {
        List<BLiveStickerMetaDataItem> list = this.f4776f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerMenuItem] */
    /* JADX INFO: renamed from: D */
    public View m5959D(ViewGroup viewGroup, int i) {
        final ?? r3 = (LiveStickerMenuItem) this.f4773c.inflater().inflate(t6c0.f19725W5, viewGroup, false);
        r3.m5801d(this.f4775e);
        r3.setOnClickListener(new View.OnClickListener() { // from class: l.nwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16283a.m5962H(r3, view);
            }
        });
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m5957A(View view, BLiveStickerMetaDataItem bLiveStickerMetaDataItem, int i, int i2) {
        ((LiveStickerMenuItem) view).m5803f(bLiveStickerMetaDataItem, this);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveStickerMetaDataItem getItem(int i) {
        List<BLiveStickerMetaDataItem> list = this.f4776f;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m5962H(LiveStickerMenuItem liveStickerMenuItem, View view) {
        a aVar = this.f4774d;
        if (aVar != null) {
            aVar.mo5965a(liveStickerMenuItem);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m5963I(a aVar) {
        this.f4774d = aVar;
    }

    /* JADX INFO: renamed from: J */
    public void m5964J(List<BLiveStickerMetaDataItem> list) {
        this.f4776f = list;
        notifyDataSetChanged();
    }

    public <V> c<V> duringCreated(c<V> cVar) {
        return c(this.f4773c, cVar);
    }
}
