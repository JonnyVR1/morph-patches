package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveGiftUserInfoViewBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import java.util.ArrayList;
import java.util.List;
import p149l.agv;
import p149l.chs;
import p149l.d8c0;
import p149l.dac0;
import p149l.fp50;
import p149l.g5c0;
import p149l.lsi0;
import p149l.mlj;
import p149l.mmj;
import p149l.mnj;
import p149l.mqv;
import p149l.t100;
import p149l.t6c0;
import p149l.v9j;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftUserInfoView extends LiveGiftUserInfoViewBindings<chs> {

    /* JADX INFO: renamed from: m */
    public mlj f50360m;

    /* JADX INFO: renamed from: n */
    public String f50361n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView$a */
    public static class C12846a extends dac0<mlj> {

        /* JADX INFO: renamed from: c */
        public final PopupWindow f50362c;

        /* JADX INFO: renamed from: d */
        public final List<mlj> f50363d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final String f50364e;

        /* JADX INFO: renamed from: f */
        public final chs<?> f50365f;

        public C12846a(PopupWindow popupWindow, String str, chs<?> chsVar) {
            this.f50362c = popupWindow;
            this.f50364e = str;
            this.f50365f = chsVar;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f50363d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f50362c.getContentView().getContext()).inflate(t6c0.f168033G1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final mlj mljVar, int i, int i2) {
            CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) view.findViewById(g5c0.f101093x2);
            ((TextView) view.findViewById(g5c0.f100917e4)).setText(mmj.m155400C(mljVar));
            agv.m96346d(commonMaskAvatarView, t100.f167273v, mqv.m155998f(mljVar).m156001c(mljVar.f134444e.f111520a, mljVar.f134441b, mljVar.f134440a), false, new w9j() { // from class: l.qxj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((mlj) obj).f134444e.f111522c;
                }
            });
            final mnj mnjVarM155523d = new mnj.C18509a().m155524e(mljVar, this.f50364e).m155523d();
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f161478a.m74552I(mljVar, mnjVarM155523d, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public mlj getItem(int i) {
            return this.f50363d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m74552I(mlj mljVar, mnj mnjVar, View view) {
            this.f50362c.dismiss();
            this.f50365f.m106991W3(new fp50().m122565i(700).m122566j(mljVar.f134446g).m122564h(mnjVar));
        }

        /* JADX INFO: renamed from: J */
        public void m74553J(List<mlj> list) {
            this.f50363d.clear();
            this.f50363d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public GiftUserInfoView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Nullable
    public mlj getCurrentGiftCallInfo() {
        T t;
        if (xdl0.m208349O0(this) && (t = this.f47960d) != 0 && TextUtils.equals("live", ((chs) t).m206027E2().mo132054A0())) {
            return this.f50360m;
        }
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m74539o0(List<mlj> list) {
        int size = (list.size() * t100.f167276y) + t100.f167261j;
        int[] iArr = new int[2];
        this.f47963g.getLocationOnScreen(iArr);
        return Math.min(size, xdl0.m208408w0() - iArr[1]);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m74540p0(mlj mljVar, View view) {
        ((chs) this.f47960d).m106989U3(mljVar.f134444e.f111520a, mljVar.f134446g);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m74541q0(mlj mljVar, View view) {
        ((chs) this.f47960d).m106988T3(mljVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m74542r0(mlj mljVar, v9j v9jVar, View view) {
        if (mljVar.m155160i()) {
            return;
        }
        List<mlj> list = (List) v9jVar.call();
        if (list.size() <= 1) {
            lsi0.m151595y("没有更多");
        } else {
            m74547w0(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m74543s0() {
        xdl0.m208345M0(this.f47962f, true);
        xdl0.m208345M0(this.f47965i, true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m74544t0(mnj mnjVar, v9j<List<mlj>> v9jVar) {
        mlj mljVarM155518g = mnjVar.m155518g();
        this.f50360m = mljVarM155518g;
        this.f50361n = mnjVar.m155513b();
        agv.m96346d(this.f47963g, t100.f167273v, mqv.m155998f(mljVarM155518g).m156001c(mljVarM155518g.f134444e.f111520a, mljVarM155518g.f134441b, mljVarM155518g.f134440a), false, new w9j() { // from class: l.kxj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((mlj) obj).f134444e.f111522c;
            }
        });
        this.f47964h.setText(mmj.m155400C(mljVarM155518g));
        m74545u0(mljVarM155518g, v9jVar);
        m74546v0(mljVarM155518g);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m74545u0(final mlj mljVar, final v9j<List<mlj>> v9jVar) {
        this.f47967k.setOnClickListener(new View.OnClickListener() { // from class: l.lxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130419a.m74540p0(mljVar, view);
            }
        });
        this.f47968l.setOnClickListener(new View.OnClickListener() { // from class: l.mxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136180a.m74541q0(mljVar, view);
            }
        });
        xdl0.m208329E0(this.f47966j, new View.OnClickListener() { // from class: l.nxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141028a.m74542r0(mljVar, v9jVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m74546v0(mlj mljVar) {
        int iM186890d;
        xdl0.m208344M(this.f47968l, !mljVar.f134442c);
        boolean zM155160i = mljVar.m155160i();
        ImageView imageView = this.f47965i;
        if (zM155160i) {
            xdl0.m208345M0(imageView, false);
            iM186890d = (int) this.f47964h.getPaint().measureText(this.f47964h.getText().toString());
        } else {
            xdl0.m208345M0(imageView, true);
            iM186890d = t100.m186890d(117.0f);
        }
        xdl0.m208327D0(iM186890d, this.f47964h);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m74547w0(List<mlj> list) {
        View viewInflate = LayoutInflater.from(this.f47964h.getContext()).inflate(t6c0.f168021F1, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, t100.m186890d(200.0f), m74539o0(list), true);
        popupWindow.setAnimationStyle(d8c0.f84850e);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(g5c0.f100850X4);
        View viewFindViewById = viewInflate.findViewById(g5c0.f100722J2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        C12846a c12846a = new C12846a(popupWindow, this.f50361n, (chs) this.f47960d);
        recyclerView.setAdapter(c12846a);
        c12846a.m74553J(list);
        xdl0.m208345M0(this.f47962f, false);
        xdl0.m208345M0(this.f47965i, false);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.oxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAsDropDown(this.f47963g, -t100.m186890d(6.0f), -t100.m186890d(49.0f));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.pxj
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f151687a.m74543s0();
            }
        });
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
