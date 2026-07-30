package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.UserActivityInfo;
import com.p1.mobile.putong.data.UserActivityInfoItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.a1c0;
import l.c3c0;
import l.m6z;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.AutoVDraweeView;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MessageKnowHimLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageKnowHimLayout f6572a;

    /* JADX INFO: renamed from: b */
    public VFrame f6573b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f6574c;

    /* JADX INFO: renamed from: d */
    public TextView f6575d;

    /* JADX INFO: renamed from: e */
    public TextView f6576e;

    /* JADX INFO: renamed from: f */
    public VFrame f6577f;

    /* JADX INFO: renamed from: g */
    public TextView f6578g;

    /* JADX INFO: renamed from: h */
    public VLinear f6579h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f6580i;

    /* JADX INFO: renamed from: j */
    public TextView f6581j;

    /* JADX INFO: renamed from: k */
    public TextView f6582k;

    /* JADX INFO: renamed from: l */
    public VLinear f6583l;

    /* JADX INFO: renamed from: m */
    public MessageKnowHimItem f6584m;

    /* JADX INFO: renamed from: n */
    public View f6585n;

    /* JADX INFO: renamed from: o */
    public MessageKnowHimItem f6586o;

    /* JADX INFO: renamed from: p */
    public MessageKnowHimItem f6587p;

    /* JADX INFO: renamed from: q */
    public View f6588q;

    /* JADX INFO: renamed from: r */
    public MessageKnowHimItem f6589r;

    /* JADX INFO: renamed from: s */
    public VFrame f6590s;

    /* JADX INFO: renamed from: t */
    public TextView f6591t;

    /* JADX INFO: renamed from: u */
    public boolean f6592u;

    /* JADX INFO: renamed from: v */
    public int f6593v;

    public MessageKnowHimLayout(Context context) {
        super(context);
    }

    private int getRootBg() {
        return CoreModule.m1854P().m11711g().m7024yc() ? c3c0.s : c3c0.v;
    }

    private void setMessageKnowHimInSVIPUI(boolean z) {
        xdl0.M(this.f6580i, false);
        this.f6590s.setBackgroundResource(c3c0.z1);
        this.f6591t.setCompoundDrawablesWithIntrinsicBounds(c3c0.H6, 0, 0, 0);
        this.f6591t.setText("开通会员解锁");
        View view = this.f6585n;
        if (z) {
            view.setBackgroundResource(c3c0.n);
            this.f6588q.setBackgroundResource(c3c0.n);
        } else {
            view.setBackgroundResource(c3c0.r);
            this.f6588q.setBackgroundResource(c3c0.r);
        }
    }

    private void setTitle(boolean z) {
        if (CoreModule.m1854P().m11711g().m7024yc()) {
            return;
        }
        String str = z ? "她" : "他";
        this.f6575d.setText(String.format("更了解%s", str));
        this.f6576e.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
        this.f6581j.setText(String.format("更了解%s", str));
        this.f6582k.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
    }

    /* JADX INFO: renamed from: c */
    public final void m9568c(View view) {
        m6z.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m9569d(View view) {
        m9574i();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9570e(String str, View view) {
        m9574i();
        if (this.f6592u) {
            if (CoreModule.m1854P().m11711g().m7024yc()) {
                CoreModule.m1854P().m11711g().m7023ya((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null, null, null);
            } else {
                CoreModule.m1854P().m11713i().m5299Lf((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9571f(@Nullable UserActivityInfo userActivityInfo) {
        ArrayList arrayListF0 = vwb.f0(new MessageKnowHimItem[]{this.f6584m, this.f6586o, this.f6587p, this.f6589r});
        if (!NullChecker.a(userActivityInfo) || userActivityInfo.activityInfos.size() < 4) {
            return;
        }
        for (int i = 0; i < arrayListF0.size(); i++) {
            MessageKnowHimItem messageKnowHimItem = (MessageKnowHimItem) arrayListF0.get(i);
            UserActivityInfoItem userActivityInfoItem = (UserActivityInfoItem) userActivityInfo.activityInfos.get(i);
            if (userActivityInfo.actorPrivilege) {
                messageKnowHimItem.m9565b(userActivityInfoItem.icon, userActivityInfoItem.value, userActivityInfoItem.category);
            } else {
                messageKnowHimItem.m9565b(userActivityInfoItem.icon, userActivityInfoItem.category, userActivityInfoItem.value);
            }
        }
        xdl0.M(this.f6579h, true);
        xdl0.M(this.f6583l, true);
    }

    /* JADX INFO: renamed from: g */
    public void m9572g(@Nullable UserActivityInfo userActivityInfo, boolean z) {
        final String str;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6583l.getLayoutParams();
        this.f6583l.setBackgroundColor(getResources().getColor(a1c0.Y));
        int i = this.f6593v;
        if (i == 2) {
            zvf0.x("e_know_him_better", "p_chat_view");
            this.f6581j.setTextSize(1, 15.0f);
            this.f6582k.setTextSize(1, 12.0f);
            xdl0.D0(t100.d(21.0f), new View[]{this.f6580i});
            xdl0.C0(this.f6580i, t100.d(21.0f));
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f6583l.setLayoutParams(layoutParams);
            boolean zM7024yc = CoreModule.m1854P().m11711g().m7024yc();
            boolean z2 = this.f6592u;
            if (zM7024yc) {
                VFrame vFrame = this.f6573b;
                if (z2) {
                    xdl0.M(vFrame, true);
                    xdl0.M(this.f6579h, false);
                    xdl0.M(this.f6583l, false);
                    this.f6572a.setBackgroundResource(c3c0.q);
                } else {
                    xdl0.M(vFrame, false);
                    m9571f(userActivityInfo);
                    xdl0.M(this.f6590s, false);
                    this.f6572a.setBackgroundResource(getRootBg());
                }
            } else {
                setMessageKnowHimInSVIPUI(z2);
                xdl0.M(this.f6573b, false);
                m9571f(userActivityInfo);
                if (this.f6592u) {
                    this.f6572a.setBackgroundResource(c3c0.q);
                } else {
                    xdl0.M(this.f6590s, false);
                    this.f6572a.setBackgroundResource(getRootBg());
                }
            }
            setTitle(z);
            str = "p_chat,femalevip_knowbetter";
        } else if (i == 1) {
            zvf0.x("e_know_him_better", "p_suggest_user_profile_info_view");
            xdl0.X(this.f6579h, t100.q);
            xdl0.D0(t100.d(22.0f), new View[]{this.f6580i});
            xdl0.C0(this.f6580i, t100.d(22.0f));
            this.f6581j.setTextSize(1, 18.0f);
            this.f6582k.setTextSize(1, 13.0f);
            int i2 = t100.o;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            layoutParams.topMargin = t100.j;
            layoutParams.bottomMargin = 0;
            this.f6583l.setLayoutParams(layoutParams);
            this.f6572a.setBackgroundColor(getResources().getColor(a1c0.a0));
            xdl0.M(this.f6573b, false);
            this.f6583l.setBackgroundResource(getRootBg());
            this.f6592u = NullChecker.a(userActivityInfo) && !userActivityInfo.actorPrivilege;
            m9571f(userActivityInfo);
            xdl0.M(this.f6590s, this.f6592u);
            setTitle(z);
            str = "p_profile,femalevip_knowbetter";
        } else {
            str = "";
        }
        xdl0.E0(this.f6572a, new View.OnClickListener() { // from class: l.l6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16248a.m9570e(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m9573h() {
        this.f6574c.x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxPUUtGUUE2Q1hFWFFJNU0yTkhaN09BWlhXWlBPUzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzA1NDAwNDc2MzE5Mzk0MzI3fQ.png", 1);
        this.f6580i.x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxWRVJYM0hFWFk3NEJKR0ZDVzVFUlpSUVRYMzRVWjE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTU5MDY5OTM1NDA4NzgzMDc4NH0.png", 1);
        this.f6578g.setTextColor(Color.parseColor("#EF8E44"));
        this.f6578g.setCompoundDrawablesWithIntrinsicBounds(c3c0.G6, 0, 0, 0);
        this.f6591t.setTextColor(Color.parseColor("#EF8E44"));
        this.f6591t.setCompoundDrawablesWithIntrinsicBounds(c3c0.G6, 0, 0, 0);
        this.f6590s.setBackgroundResource(c3c0.u);
        this.f6585n.setBackgroundResource(c3c0.r);
        this.f6588q.setBackgroundResource(c3c0.r);
    }

    /* JADX INFO: renamed from: i */
    public final void m9574i() {
        zvf0.r("e_know_him_better", this.f6593v == 2 ? "p_chat_view" : "p_suggest_user_profile_info_view");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9568c(this);
        this.f6574c.x("https://auto.tancdn.com/v1/images/eyJpZCI6IjQzTDNQMlVGNVlRUlU3RFZSTTNZUVBaWTdZT0JRSzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDgzMDQ2OTAyODk4NTU4OTE0Mn0.png", 1);
        this.f6580i.x("https://auto.tancdn.com/v1/images/eyJpZCI6IlpENUFERlRQNTQyQ1E2UTdFVEhCN1k1NUZFTkhYRTE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE3Mjg0MDYxMDA1NTEzMjkyOH0.png", 1);
        setOnClickListener(new View.OnClickListener() { // from class: l.k6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15639a.m9569d(view);
            }
        });
        if (CoreModule.m1854P().m11711g().m6991d9()) {
            m9573h();
        }
    }

    public void setLocked(boolean z) {
        this.f6592u = z;
    }

    public void setPage(int i) {
        this.f6593v = i;
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
