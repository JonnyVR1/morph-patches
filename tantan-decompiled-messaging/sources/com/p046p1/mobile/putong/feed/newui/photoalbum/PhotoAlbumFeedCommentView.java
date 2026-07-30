package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VText;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.i0e;
import p149l.kjb0;
import p149l.mkd0;
import p149l.q570;
import p149l.rmr;
import p149l.roj0;
import p149l.t100;
import p149l.t2h;
import p149l.u5j;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFeedCommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f41236a;

    /* JADX INFO: renamed from: b */
    public View f41237b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f41238c;

    /* JADX INFO: renamed from: d */
    public MomentItem f41239d;

    public PhotoAlbumFeedCommentView(Context context) {
        super(context);
        this.f41238c = null;
    }

    /* JADX INFO: renamed from: z */
    public static SpannableStringBuilder m63656z(String str, ArrayList<String> arrayList, ArrayList<u5j> arrayList2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < arrayList.size(); i++) {
            String str2 = arrayList.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(arrayList2.get(i), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j */
    public final void m63657j(View view) {
        q570.m172994a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public Act m63658k() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m63669v(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(str).m64846m(this.f41239d.f41351d.f56011id).m64847n(this.f41239d.f41351d.owner).m64853t(true).m64848o(this.f41239d.f41351d.momentValue).m64835b();
        if (intentM64835b == null) {
            return;
        }
        m63658k().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m63668u(User user) {
        m63658k().startActivity(PhotoAlbumFeedAct.m64355V1(m63658k(), user.f56011id, "comment_list", -1, 2));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m63661n(roj0 roj0Var) {
        m63658k().progressDismiss();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m63662o(Throwable th) {
        t2h.m186976g(th);
        m63658k().progressDismiss();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63657j(this);
        this.f41236a.setMovementMethod(rmr.m180046a());
        this.f41236a.setPadding(t100.m186890d(44.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m63663p(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.m114766q(this.f41238c.value);
        } else {
            m63658k().progress(R$string.f38984U2, true);
            FeedModule.f38855d.m209313L6(this.f41238c).subscribe(mkd0.m154956H(new e30() { // from class: l.o570
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141881a.m63661n((roj0) obj);
                }
            }, new e30() { // from class: l.p570
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147266a.m63662o((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m63664q(View view) {
        if (this.f41238c.isOtherUser()) {
            i0e.m133793b(m63658k(), this.f41238c.value);
        } else if (TEnum.equals(this.f41238c.status(), "failed")) {
            kjb0.m146210u(m63658k(), this.f41238c);
        } else {
            ArrayList arrayListM200324f0 = vwb.m200324f0(m63658k().getString(R$string.f39045e), m63658k().getString(R$string.f38949O3));
            if (!TEnum.equals(this.f41238c.status(), "normal")) {
                arrayListM200324f0.remove(1);
            }
            m63658k().dialog().m20535e0(arrayListM200324f0).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.i570
                @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                /* JADX INFO: renamed from: a */
                public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                    this.f111532a.m63663p(dialog, view2, i, charSequence);
                }
            }).m20568z0();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m63670w(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem, String str) {
        this.f41239d = momentItem;
        if (NullChecker.m81303a(this.f41238c) && NullChecker.m81304b(momentItem) && this.f41238c.equals(momentItem) && TEnum.equals(this.f41238c.status(), momentItem.f41350c.status())) {
            return;
        }
        this.f41238c = momentItem.f41350c;
        this.f41236a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h570
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f105934a.m63664q(view);
            }
        });
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f41238c.owner);
        if (NullChecker.m81303a(userM209447e8)) {
            m63671x(photoAlbumBaseFrag, userM209447e8, this.f41238c, str);
            return;
        }
        CrashHelper.m81296c(new Exception("PhotoAlbumFeedCommendView render user = null:" + this.f41238c.owner));
    }

    /* JADX INFO: renamed from: x */
    public final void m63671x(final PhotoAlbumBaseFrag photoAlbumBaseFrag, final User user, MomentMessage momentMessage, final String str) {
        String str2 = user.name;
        String string = getResources().getString(R$string.f39021a3);
        final User userM209447e8 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? FeedModule.f38855d.m209447e8(momentMessage.api_only_otherUser) : null;
        ArrayList arrayList = new ArrayList();
        int iColor = m63658k().color(e1c0.f88781e0);
        int iColor2 = m63658k().color(e1c0.f88777c0);
        StringBuilder sb = new StringBuilder();
        if (!this.f41238c.owner.equals(this.f41239d.f41351d.owner) || this.f41239d.f41351d.owner.equals(this.f41238c.api_only_otherUser) || !NullChecker.m81303a(userM209447e8)) {
            sb.append(str2);
            sb.append("：");
            sb.append(momentMessage.value);
            arrayList.add(new u5j(iColor, new d30() { // from class: l.m570
                @Override // p149l.d30
                public final void call() {
                    this.f131372a.m63668u(user);
                }
            }));
            arrayList.add(new u5j(iColor2, new d30() { // from class: l.n570
                @Override // p149l.d30
                public final void call() {
                    this.f137192a.m63669v(photoAlbumBaseFrag, str);
                }
            }));
            this.f41236a.setText(m63656z(sb.toString(), vwb.m200324f0(str2, momentMessage.value), arrayList));
            return;
        }
        String str3 = userM209447e8.name;
        sb.append(str2);
        sb.append(string);
        sb.append(str3);
        sb.append("：");
        sb.append(momentMessage.value);
        arrayList.add(new u5j(iColor, new d30() { // from class: l.j570
            @Override // p149l.d30
            public final void call() {
                this.f116275a.m63665r(user);
            }
        }));
        arrayList.add(new u5j(iColor2, null));
        arrayList.add(new u5j(iColor, new d30() { // from class: l.k570
            @Override // p149l.d30
            public final void call() {
                this.f121151a.m63666s(userM209447e8);
            }
        }));
        arrayList.add(new u5j(iColor2, new d30() { // from class: l.l570
            @Override // p149l.d30
            public final void call() {
                this.f126091a.m63667t(photoAlbumBaseFrag, str);
            }
        }));
        this.f41236a.setText(m63656z(sb.toString(), vwb.m200324f0(str2, string, str3, momentMessage.value), arrayList));
    }

    /* JADX INFO: renamed from: y */
    public void m63672y(boolean z) {
        if (z) {
            this.f41237b.setPadding(0, 0, 0, 0);
        }
        xdl0.m208344M(this.f41237b, z);
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41238c = null;
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41238c = null;
    }
}
