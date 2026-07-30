package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InterestLevel;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class a7j extends em2 {

    /* JADX INFO: renamed from: l.a7j$a */
    public class ViewOnTouchListenerC15665a implements View.OnTouchListener {
        public ViewOnTouchListenerC15665a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiteratureMessageLayout) {
            CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout = (CardBottomLiteratureMessageLayout) view;
            m121321k(cardBottomLiteratureMessageLayout.f24259e, c8021d, i);
            m121323m(cardBottomLiteratureMessageLayout.f24260f, c8021d, i);
            if (NullChecker.m82486a(c8021d) && NullChecker.m82486a(c8021d.getUser()) && NullChecker.m82486a(c8021d.getUser().localRelationship) && NullChecker.m82486a(c8021d.getUser().localRelationship.relationshipExtensions) && !TextUtils.isEmpty(c8021d.getUser().localRelationship.relationshipExtensions.otherLetter)) {
                String str = c8021d.getUser().localRelationship.relationshipExtensions.otherLetter;
                c8021d.f22779j.f22789h = c8021d.getUser().localRelationship.relationshipExtensions.otherLiteratureCommentId;
                cardBottomLiteratureMessageLayout.f24257c.setVisibility(0);
                cardBottomLiteratureMessageLayout.f24258d.setText(str);
            } else {
                cardBottomLiteratureMessageLayout.f24257c.setVisibility(4);
                cardBottomLiteratureMessageLayout.f24258d.setText("");
            }
            for (int i2 = 0; i2 < cardBottomLiteratureMessageLayout.f24257c.getChildCount(); i2++) {
                View childAt = cardBottomLiteratureMessageLayout.f24257c.getChildAt(i2);
                childAt.setEnabled(true);
                childAt.setOnTouchListener(new ViewOnTouchListenerC15665a());
            }
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        String str;
        super.mo96367j(c8021d, qk4Var, i);
        if (qk4Var.m176921c() instanceof CardBottomLiteratureMessageLayout) {
            if (c8021d.mo38481f() != null) {
                bnl0.m105537U(c8021d.mo38481f().mo37860V(), qa00.m175859d(100.0f));
            }
            if (!TextUtils.isEmpty(c8021d.f22779j.f22789h) && (c8021d.mo38481f().getContext() instanceof Act)) {
                LiteraturesComments literaturesCommentsM60632o = BookMoviesDramasHelper.m60632o(CoreModule.m30929H().userId(), c8021d.f22779j.f22789h);
                if (NullChecker.m82486a(literaturesCommentsM60632o) && NullChecker.m82486a(literaturesCommentsM60632o.localLiteratures)) {
                    Literatures literatures = literaturesCommentsM60632o.localLiteratures;
                    String str2 = literaturesCommentsM60632o.interestLevel;
                    String str3 = c8021d.getUser().f56859id;
                    String str4 = literatures.title;
                    String strM96369p = m96369p(literatures.category);
                    String str5 = "";
                    if (NullChecker.m82486a(c8021d.getUserInfo()) && NullChecker.m82486a(c8021d.getUserInfo().literaturesComments)) {
                        str = "";
                        for (LiteraturesComments literaturesComments : c8021d.getUserInfo().literaturesComments) {
                            if (literaturesComments.literatureID.equals(literaturesCommentsM60632o.literatureID) && literaturesComments.interestLevel.equals(str2)) {
                                str = literaturesComments.interestLevel;
                            }
                        }
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.equals(str2, InterestLevel.to_watch)) {
                            str5 = "single_wish";
                        } else if (TextUtils.equals(str2, InterestLevel.watching)) {
                            str5 = "single_watching";
                        } else if (TextUtils.equals(str2, InterestLevel.watched)) {
                            str5 = "single_watched";
                        }
                    } else if (TextUtils.equals(str2, InterestLevel.to_watch)) {
                        str5 = "both_wish";
                    } else if (TextUtils.equals(str2, InterestLevel.watching)) {
                        str5 = "both_watching";
                    } else if (TextUtils.equals(str2, InterestLevel.watched)) {
                        str5 = "both_watched";
                    }
                    i4g0.m138492A("e_card_artwork_message", "p_suggest_users_home_view", jyb.m147494Y("artwork_status", str5), jyb.m147494Y("artwork_title", str4), jyb.m147494Y("artwork_type", strM96369p), jyb.m147494Y("receiver_user_id", str3));
                }
            }
        }
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m96369p(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }
}
