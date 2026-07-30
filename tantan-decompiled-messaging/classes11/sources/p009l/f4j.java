package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f4j extends wl2 {

    /* JADX INFO: renamed from: l.f4j$a */
    public class ViewOnTouchListenerC0884a implements View.OnTouchListener {
        public ViewOnTouchListenerC0884a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiteratureMessageLayout) {
            CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout = (CardBottomLiteratureMessageLayout) view;
            m24310k(cardBottomLiteratureMessageLayout.f2295e, c0034d, i);
            m24312m(cardBottomLiteratureMessageLayout.f2296f, c0034d, i);
            if (NullChecker.a(c0034d) && NullChecker.a(c0034d.getUser()) && NullChecker.a(c0034d.getUser().localRelationship) && NullChecker.a(c0034d.getUser().localRelationship.relationshipExtensions) && !TextUtils.isEmpty(c0034d.getUser().localRelationship.relationshipExtensions.otherLetter)) {
                String str = c0034d.getUser().localRelationship.relationshipExtensions.otherLetter;
                c0034d.f815j.f825h = c0034d.getUser().localRelationship.relationshipExtensions.otherLiteratureCommentId;
                cardBottomLiteratureMessageLayout.f2293c.setVisibility(0);
                cardBottomLiteratureMessageLayout.f2294d.setText(str);
            } else {
                cardBottomLiteratureMessageLayout.f2293c.setVisibility(4);
                cardBottomLiteratureMessageLayout.f2294d.setText("");
            }
            for (int i2 = 0; i2 < cardBottomLiteratureMessageLayout.f2293c.getChildCount(); i2++) {
                View childAt = cardBottomLiteratureMessageLayout.f2293c.getChildAt(i2);
                childAt.setEnabled(true);
                childAt.setOnTouchListener(new ViewOnTouchListenerC0884a());
            }
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        String str;
        super.mo13735j(c0034d, rj4Var, i);
        if (rj4Var.m21680c() instanceof CardBottomLiteratureMessageLayout) {
            if (c0034d.mo1449f() != null) {
                xdl0.U(c0034d.mo1449f().mo815V(), t100.d(100.0f));
            }
            if (!TextUtils.isEmpty(c0034d.f815j.f825h) && (c0034d.mo1449f().getContext() instanceof Act)) {
                LiteraturesComments literaturesCommentsO = BookMoviesDramasHelper.o(CoreModule.H().userId(), c0034d.f815j.f825h);
                if (NullChecker.a(literaturesCommentsO) && NullChecker.a(literaturesCommentsO.localLiteratures)) {
                    Literatures literatures = literaturesCommentsO.localLiteratures;
                    String str2 = literaturesCommentsO.interestLevel;
                    String str3 = ((DbObject) c0034d.getUser()).id;
                    String str4 = literatures.title;
                    String strM14209p = m14209p(literatures.category);
                    String str5 = "";
                    if (NullChecker.a(c0034d.getUserInfo()) && NullChecker.a(c0034d.getUserInfo().literaturesComments)) {
                        str = "";
                        for (LiteraturesComments literaturesComments : c0034d.getUserInfo().literaturesComments) {
                            if (literaturesComments.literatureID.equals(literaturesCommentsO.literatureID) && literaturesComments.interestLevel.equals(str2)) {
                                str = literaturesComments.interestLevel;
                            }
                        }
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.equals(str2, "to_watch")) {
                            str5 = "single_wish";
                        } else if (TextUtils.equals(str2, "watching")) {
                            str5 = "single_watching";
                        } else if (TextUtils.equals(str2, "watched")) {
                            str5 = "single_watched";
                        }
                    } else if (TextUtils.equals(str2, "to_watch")) {
                        str5 = "both_wish";
                    } else if (TextUtils.equals(str2, "watching")) {
                        str5 = "both_watching";
                    } else if (TextUtils.equals(str2, "watched")) {
                        str5 = "both_watched";
                    }
                    zvf0.A("e_card_artwork_message", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_status", str5), vwb.Y("artwork_title", str4), vwb.Y("artwork_type", strM14209p), vwb.Y("receiver_user_id", str3)});
                }
            }
        }
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m14209p(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }
}
