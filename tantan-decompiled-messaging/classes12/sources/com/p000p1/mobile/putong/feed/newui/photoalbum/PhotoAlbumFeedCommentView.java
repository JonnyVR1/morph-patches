package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.e1c0;
import p007l.kjb0;
import p007l.q570;
import p007l.rmr;
import p007l.t2h;
import p007l.u5j;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFeedCommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f2697a;

    /* JADX INFO: renamed from: b */
    public View f2698b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f2699c;

    /* JADX INFO: renamed from: d */
    public MomentItem f2700d;

    public PhotoAlbumFeedCommentView(Context context) {
        super(context);
        this.f2699c = null;
    }

    /* JADX INFO: renamed from: z */
    public static SpannableStringBuilder m4678z(String str, ArrayList<String> arrayList, ArrayList<u5j> arrayList2) {
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
    public final void m4679j(View view) {
        q570.m13388a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public Act m4680k() {
        return getContext();
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m4691v(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(str).m5943m(((DbObject) this.f2700d.f2812d).id).m5944n(this.f2700d.f2812d.owner).m5950t(true).m5945o(this.f2700d.f2812d.momentValue).m5932b();
        if (intentM5932b == null) {
            return;
        }
        m4680k().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m4690u(User user) {
        m4680k().startActivity(PhotoAlbumFeedAct.m5428V1(m4680k(), ((DbObject) user).id, "comment_list", -1, 2));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m4683n(roj0 roj0Var) {
        m4680k().progressDismiss();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m4684o(Throwable th) {
        t2h.m14427g(th);
        m4680k().progressDismiss();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4679j(this);
        this.f2697a.setMovementMethod(rmr.m13916a());
        this.f2697a.setPadding(t100.d(44.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m4685p(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.q(this.f2699c.value);
        } else {
            m4680k().progress(R$string.f445U2, true);
            FeedModule.f316d.m16494L6(this.f2699c).subscribe(mkd0.H(new e30() { // from class: l.o570
                public final void call(Object obj) {
                    this.f11009a.m4683n((roj0) obj);
                }
            }, new e30() { // from class: l.p570
                public final void call(Object obj) {
                    this.f11700a.m4684o((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m4686q(View view) {
        if (this.f2699c.isOtherUser()) {
            i0e.b(m4680k(), this.f2699c.value);
        } else if (TEnum.equals(this.f2699c.status(), "failed")) {
            kjb0.m11469u(m4680k(), this.f2699c);
        } else {
            ArrayList arrayListF0 = vwb.f0(new String[]{m4680k().getString(R$string.f506e), m4680k().getString(R$string.f410O3)});
            if (!TEnum.equals(this.f2699c.status(), "normal")) {
                arrayListF0.remove(1);
            }
            m4680k().dialog().e0(arrayListF0).g0(new Dialog.g() { // from class: l.i570
                /* JADX INFO: renamed from: a */
                public final void m10776a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                    this.f8905a.m4685p(dialog, view2, i, charSequence);
                }
            }).z0();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m4692w(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem, String str) {
        this.f2700d = momentItem;
        if (NullChecker.a(this.f2699c) && NullChecker.b(momentItem) && this.f2699c.equals(momentItem) && TEnum.equals(this.f2699c.status(), momentItem.f2811c.status())) {
            return;
        }
        this.f2699c = momentItem.f2811c;
        this.f2697a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h570
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f8601a.m4686q(view);
            }
        });
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f2699c.owner);
        if (NullChecker.a(userM16628e8)) {
            m4693x(photoAlbumBaseFrag, userM16628e8, this.f2699c, str);
            return;
        }
        CrashHelper.c(new Exception("PhotoAlbumFeedCommendView render user = null:" + this.f2699c.owner));
    }

    /* JADX INFO: renamed from: x */
    public final void m4693x(final PhotoAlbumBaseFrag photoAlbumBaseFrag, final User user, MomentMessage momentMessage, final String str) {
        String str2 = user.name;
        String string = getResources().getString(R$string.f482a3);
        final User userM16628e8 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? FeedModule.f316d.m16628e8(momentMessage.api_only_otherUser) : null;
        ArrayList arrayList = new ArrayList();
        int iColor = m4680k().color(e1c0.f7137e0);
        int iColor2 = m4680k().color(e1c0.f7133c0);
        StringBuilder sb = new StringBuilder();
        if (!this.f2699c.owner.equals(this.f2700d.f2812d.owner) || this.f2700d.f2812d.owner.equals(this.f2699c.api_only_otherUser) || !NullChecker.a(userM16628e8)) {
            sb.append(str2);
            sb.append("：");
            sb.append(momentMessage.value);
            arrayList.add(new u5j(iColor, new d30() { // from class: l.m570
                public final void call() {
                    this.f10235a.m4690u(user);
                }
            }));
            arrayList.add(new u5j(iColor2, new d30() { // from class: l.n570
                public final void call() {
                    this.f10669a.m4691v(photoAlbumBaseFrag, str);
                }
            }));
            this.f2697a.setText(m4678z(sb.toString(), vwb.f0(new String[]{str2, momentMessage.value}), arrayList));
            return;
        }
        String str3 = userM16628e8.name;
        sb.append(str2);
        sb.append(string);
        sb.append(str3);
        sb.append("：");
        sb.append(momentMessage.value);
        arrayList.add(new u5j(iColor, new d30() { // from class: l.j570
            public final void call() {
                this.f9228a.m4687r(user);
            }
        }));
        arrayList.add(new u5j(iColor2, null));
        arrayList.add(new u5j(iColor, new d30() { // from class: l.k570
            public final void call() {
                this.f9616a.m4688s(userM16628e8);
            }
        }));
        arrayList.add(new u5j(iColor2, new d30() { // from class: l.l570
            public final void call() {
                this.f9886a.m4689t(photoAlbumBaseFrag, str);
            }
        }));
        this.f2697a.setText(m4678z(sb.toString(), vwb.f0(new String[]{str2, string, str3, momentMessage.value}), arrayList));
    }

    /* JADX INFO: renamed from: y */
    public void m4694y(boolean z) {
        if (z) {
            this.f2698b.setPadding(0, 0, 0, 0);
        }
        xdl0.M(this.f2698b, z);
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2699c = null;
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2699c = null;
    }
}
