package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InterestLevel;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class f4j extends wl2 {

    /* JADX INFO: renamed from: l.f4j$a */
    public class ViewOnTouchListenerC16753a implements View.OnTouchListener {
        public ViewOnTouchListenerC16753a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiteratureMessageLayout) {
            CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout = (CardBottomLiteratureMessageLayout) view;
            m203741k(cardBottomLiteratureMessageLayout.f23517e, c7870d, i);
            m203743m(cardBottomLiteratureMessageLayout.f23518f, c7870d, i);
            if (NullChecker.m81303a(c7870d) && NullChecker.m81303a(c7870d.getUser()) && NullChecker.m81303a(c7870d.getUser().localRelationship) && NullChecker.m81303a(c7870d.getUser().localRelationship.relationshipExtensions) && !TextUtils.isEmpty(c7870d.getUser().localRelationship.relationshipExtensions.otherLetter)) {
                String str = c7870d.getUser().localRelationship.relationshipExtensions.otherLetter;
                c7870d.f22037j.f22047h = c7870d.getUser().localRelationship.relationshipExtensions.otherLiteratureCommentId;
                cardBottomLiteratureMessageLayout.f23515c.setVisibility(0);
                cardBottomLiteratureMessageLayout.f23516d.setText(str);
            } else {
                cardBottomLiteratureMessageLayout.f23515c.setVisibility(4);
                cardBottomLiteratureMessageLayout.f23516d.setText("");
            }
            for (int i2 = 0; i2 < cardBottomLiteratureMessageLayout.f23515c.getChildCount(); i2++) {
                View childAt = cardBottomLiteratureMessageLayout.f23515c.getChildAt(i2);
                childAt.setEnabled(true);
                childAt.setOnTouchListener(new ViewOnTouchListenerC16753a());
            }
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        String str;
        super.mo114808j(c7870d, rj4Var, i);
        if (rj4Var.m179548c() instanceof CardBottomLiteratureMessageLayout) {
            if (c7870d.mo37478f() != null) {
                xdl0.m208357U(c7870d.mo37478f().mo36857V(), t100.m186890d(100.0f));
            }
            if (!TextUtils.isEmpty(c7870d.f22037j.f22047h) && (c7870d.mo37478f().getContext() instanceof Act)) {
                LiteraturesComments literaturesCommentsM59448o = BookMoviesDramasHelper.m59448o(CoreModule.m29931H().userId(), c7870d.f22037j.f22047h);
                if (NullChecker.m81303a(literaturesCommentsM59448o) && NullChecker.m81303a(literaturesCommentsM59448o.localLiteratures)) {
                    Literatures literatures = literaturesCommentsM59448o.localLiteratures;
                    String str2 = literaturesCommentsM59448o.interestLevel;
                    String str3 = c7870d.getUser().f56011id;
                    String str4 = literatures.title;
                    String strM119321p = m119321p(literatures.category);
                    String str5 = "";
                    if (NullChecker.m81303a(c7870d.getUserInfo()) && NullChecker.m81303a(c7870d.getUserInfo().literaturesComments)) {
                        str = "";
                        for (LiteraturesComments literaturesComments : c7870d.getUserInfo().literaturesComments) {
                            if (literaturesComments.literatureID.equals(literaturesCommentsM59448o.literatureID) && literaturesComments.interestLevel.equals(str2)) {
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
                    zvf0.m220368A("e_card_artwork_message", "p_suggest_users_home_view", vwb.m200311Y("artwork_status", str5), vwb.m200311Y("artwork_title", str4), vwb.m200311Y("artwork_type", strM119321p), vwb.m200311Y("receiver_user_id", str3));
                }
            }
        }
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m119321p(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }
}
