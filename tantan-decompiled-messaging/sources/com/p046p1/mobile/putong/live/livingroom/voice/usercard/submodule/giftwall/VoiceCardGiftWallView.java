package com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.avm0;
import p149l.d1q;
import p149l.d30;
import p149l.hxs;
import p149l.kvc0;
import p149l.t100;
import p149l.uep0;
import p149l.vdt;
import p149l.vwb;
import p149l.wum0;
import p149l.xdl0;
import p149l.xlf0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardGiftWallView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53823a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53824b;

    /* JADX INFO: renamed from: c */
    public TextView f53825c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f53826d;

    /* JADX INFO: renamed from: e */
    public VImage f53827e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f53828f;

    public VoiceCardGiftWallView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static String m78713g(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(i));
            if (i < length - 1) {
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m78714d(View view) {
        avm0.m99204a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m78715e() {
        this.f53823a.setController(null);
        this.f53828f.m67371Z(vwb.m200324f0(new d1q[0]));
    }

    /* JADX INFO: renamed from: f */
    public void m78716f() {
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f53828f = liveBaseAdapter;
        this.f53826d.setAdapter(liveBaseAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f53826d.setLayoutManager(linearLayoutManager);
        this.f53826d.setHasFixedSize(true);
        this.f53826d.addItemDecoration(new xlf0(t100.m186890d(12.0f), 0, 0));
        uep0.m193326m(this, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: h */
    public void m78717h(Act act, List<BLiveUserCardGiftWall> list, final d30 d30Var, final Action1<String> action1) {
        this.f53826d.scrollToPosition(0);
        xdl0.m208329E0(this.f53827e, new View.OnClickListener() { // from class: l.xum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(list)) {
            list = vwb.m200324f0(BLiveUserCardGiftWall.new_());
        }
        BLiveUserCardGiftWall bLiveUserCardGiftWall = list.get(0);
        hxs.m133406s("context_livingAct", this.f53823a, bLiveUserCardGiftWall.bgImage);
        hxs.m133406s("context_livingAct", this.f53824b, bLiveUserCardGiftWall.titleBgImage);
        boolean zM198093c = vdt.m198093c();
        TextView textView = this.f53825c;
        if (zM198093c) {
            textView.setRotation(90.0f);
            this.f53825c.setText(bLiveUserCardGiftWall.title);
        } else {
            textView.setText(m78713g(bLiveUserCardGiftWall.title));
        }
        this.f53825c.setTextColor(kvc0.m147358g(bLiveUserCardGiftWall.titleColor));
        if (vwb.m200296J(bLiveUserCardGiftWall.gifts)) {
            bLiveUserCardGiftWall.gifts = new ArrayList();
        }
        List<BLiveUserCardGiftWallGift> list2 = bLiveUserCardGiftWall.gifts;
        for (int i = 0; i < list2.size(); i++) {
            final BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = list2.get(i);
            wum0 wum0Var = new wum0(bLiveUserCardGiftWallGift, act);
            if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.f44469id)) {
                wum0Var.mo109662A(new View.OnClickListener() { // from class: l.yum0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d30Var.call();
                    }
                });
            } else {
                wum0Var.mo109662A(new View.OnClickListener() { // from class: l.zum0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        action1.call(bLiveUserCardGiftWallGift.f44469id);
                    }
                });
            }
            arrayList.add(wum0Var);
        }
        this.f53828f.m67371Z(arrayList);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78714d(this);
        m78716f();
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
