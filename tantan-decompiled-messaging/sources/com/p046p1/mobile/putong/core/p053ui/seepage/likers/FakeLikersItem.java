package com.p046p1.mobile.putong.core.p053ui.seepage.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.qib0;
import p149l.t100;
import p149l.tae0;
import p149l.uyf;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class FakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f35782h;

    /* JADX INFO: renamed from: i */
    public VText f35783i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f35784j;

    /* JADX INFO: renamed from: k */
    public TextView f35785k;

    /* JADX INFO: renamed from: l */
    public VText f35786l;

    /* JADX INFO: renamed from: m */
    public VImage f35787m;

    /* JADX INFO: renamed from: n */
    public User f35788n;

    /* JADX INFO: renamed from: o */
    public LikeLabelType f35789o;

    public enum LikeLabelType {
        HIDE("不展示"),
        VERIFY("认证邀请"),
        SUPER_LIKE("超级喜欢"),
        IMMEDIATELY_CHAT("即刻聊天"),
        NEW_LIKE("新的喜欢");

        String desc;

        LikeLabelType(String str) {
            this.desc = str;
        }
    }

    public FakeLikersItem(@NonNull Context context) {
        super(context);
        this.f35789o = LikeLabelType.HIDE;
    }

    public User getUser() {
        return this.f35788n;
    }

    /* JADX INFO: renamed from: h */
    public final void m54965h(View view) {
        uyf.m196290a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m54966i() {
        this.f35787m.setImageResource(b3c0.f73045f2);
    }

    /* JADX INFO: renamed from: j */
    public final void m54967j(User user, long j) {
        xdl0.m208345M0(this.f35783i, false);
        this.f35789o = LikeLabelType.HIDE;
        if (NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.cardInfo) && !vwb.m200296J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f35789o = LikeLabelType.VERIFY;
            this.f35783i.setText("来自邀请认证");
            this.f35783i.setTypeface(Typeface.DEFAULT_BOLD);
            this.f35783i.setBackgroundResource(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73093l2 : b3c0.f73085k2);
            this.f35783i.setCompoundDrawablesWithIntrinsicBounds(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73061h2 : b3c0.f73053g2, 0, 0, 0);
            xdl0.m208345M0(this.f35783i, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f35789o = LikeLabelType.SUPER_LIKE;
            xdl0.m208345M0(this.f35783i, true);
            this.f35783i.setBackgroundResource(b3c0.f73101m2);
            this.f35783i.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73037e2, 0, 0, 0);
            if (CoreModule.m29935P().m94651a().mo33587sf() && NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && CoreModule.m29935P().m94651a().mo33335Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
                this.f35783i.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
                return;
            } else {
                this.f35783i.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
                return;
            }
        }
        if (j == 0 || !NullChecker.m81303a(user.localRelationship)) {
            return;
        }
        double d = user.localRelationship.updateTime;
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || j >= d) {
            return;
        }
        this.f35789o = LikeLabelType.NEW_LIKE;
        xdl0.m208345M0(this.f35783i, true);
        this.f35783i.setText("新喜欢");
        this.f35783i.setBackgroundResource(b3c0.f73085k2);
        this.f35783i.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73029d2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public void m54968k(User user, long j) {
        this.f35788n = user;
        qib0.f154691G.m102336O(this.f35782h, user.m60124fp().profileBig().formatted(), 3, 100);
        this.f35786l.setText(tae0.m187706i(user, getContext()));
        xdl0.m208345M0(this.f35785k, tae0.m187713q(user));
        m54967j(user, j);
    }

    /* JADX INFO: renamed from: l */
    public void m54969l(User user) {
        this.f35788n = user;
        qib0.f154691G.m102336O(this.f35782h, user.m60124fp().profileBig().formatted(), 4, 35);
        this.f35786l.setText(tae0.m187706i(user, getContext()));
        xdl0.m208345M0(this.f35785k, tae0.m187713q(user));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54965h(this);
        m54966i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35784j.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f35784j.setLayoutParams(layoutParams);
        }
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f35789o == LikeLabelType.NEW_LIKE) {
            this.f35783i.setText(str);
        }
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35789o = LikeLabelType.HIDE;
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35789o = LikeLabelType.HIDE;
    }
}
