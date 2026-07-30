package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.UserActivityInfo;
import com.p046p1.mobile.putong.data.UserActivityInfoItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.AutoVDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p149l.a1c0;
import p149l.c3c0;
import p149l.m6z;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class MessageKnowHimLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageKnowHimLayout f36791a;

    /* JADX INFO: renamed from: b */
    public VFrame f36792b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f36793c;

    /* JADX INFO: renamed from: d */
    public TextView f36794d;

    /* JADX INFO: renamed from: e */
    public TextView f36795e;

    /* JADX INFO: renamed from: f */
    public VFrame f36796f;

    /* JADX INFO: renamed from: g */
    public TextView f36797g;

    /* JADX INFO: renamed from: h */
    public VLinear f36798h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f36799i;

    /* JADX INFO: renamed from: j */
    public TextView f36800j;

    /* JADX INFO: renamed from: k */
    public TextView f36801k;

    /* JADX INFO: renamed from: l */
    public VLinear f36802l;

    /* JADX INFO: renamed from: m */
    public MessageKnowHimItem f36803m;

    /* JADX INFO: renamed from: n */
    public View f36804n;

    /* JADX INFO: renamed from: o */
    public MessageKnowHimItem f36805o;

    /* JADX INFO: renamed from: p */
    public MessageKnowHimItem f36806p;

    /* JADX INFO: renamed from: q */
    public View f36807q;

    /* JADX INFO: renamed from: r */
    public MessageKnowHimItem f36808r;

    /* JADX INFO: renamed from: s */
    public VFrame f36809s;

    /* JADX INFO: renamed from: t */
    public TextView f36810t;

    /* JADX INFO: renamed from: u */
    public boolean f36811u;

    /* JADX INFO: renamed from: v */
    public int f36812v;

    public MessageKnowHimLayout(Context context) {
        super(context);
    }

    private int getRootBg() {
        return CoreModule.m29935P().m94656g().mo35087yc() ? c3c0.f78854s : c3c0.f78881v;
    }

    private void setMessageKnowHimInSVIPUI(boolean z) {
        xdl0.m208344M(this.f36799i, false);
        this.f36809s.setBackgroundResource(c3c0.f78919z1);
        this.f36810t.setCompoundDrawablesWithIntrinsicBounds(c3c0.f78537H6, 0, 0, 0);
        this.f36810t.setText("开通会员解锁");
        View view = this.f36804n;
        if (z) {
            view.setBackgroundResource(c3c0.f78809n);
            this.f36807q.setBackgroundResource(c3c0.f78809n);
        } else {
            view.setBackgroundResource(c3c0.f78845r);
            this.f36807q.setBackgroundResource(c3c0.f78845r);
        }
    }

    private void setTitle(boolean z) {
        if (CoreModule.m29935P().m94656g().mo35087yc()) {
            return;
        }
        String str = z ? "她" : "他";
        this.f36794d.setText(String.format("更了解%s", str));
        this.f36795e.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
        this.f36800j.setText(String.format("更了解%s", str));
        this.f36801k.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
    }

    /* JADX INFO: renamed from: c */
    public final void m56141c(View view) {
        m6z.m153318a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m56142d(View view) {
        m56147i();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m56143e(String str, View view) {
        m56147i();
        if (this.f36811u) {
            if (CoreModule.m29935P().m94656g().mo35087yc()) {
                CoreModule.m29935P().m94656g().mo35086ya((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null, null, null);
            } else {
                CoreModule.m29935P().m94658i().mo33362Lf((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56144f(@Nullable UserActivityInfo userActivityInfo) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(this.f36803m, this.f36805o, this.f36806p, this.f36808r);
        if (!NullChecker.m81303a(userActivityInfo) || userActivityInfo.activityInfos.size() < 4) {
            return;
        }
        for (int i = 0; i < arrayListM200324f0.size(); i++) {
            MessageKnowHimItem messageKnowHimItem = (MessageKnowHimItem) arrayListM200324f0.get(i);
            UserActivityInfoItem userActivityInfoItem = userActivityInfo.activityInfos.get(i);
            if (userActivityInfo.actorPrivilege) {
                messageKnowHimItem.m56138b(userActivityInfoItem.icon, userActivityInfoItem.value, userActivityInfoItem.category);
            } else {
                messageKnowHimItem.m56138b(userActivityInfoItem.icon, userActivityInfoItem.category, userActivityInfoItem.value);
            }
        }
        xdl0.m208344M(this.f36798h, true);
        xdl0.m208344M(this.f36802l, true);
    }

    /* JADX INFO: renamed from: g */
    public void m56145g(@Nullable UserActivityInfo userActivityInfo, boolean z) {
        final String str;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36802l.getLayoutParams();
        this.f36802l.setBackgroundColor(getResources().getColor(a1c0.f67143Y));
        int i = this.f36812v;
        if (i == 2) {
            zvf0.m220402x("e_know_him_better", OMSDialogPositon.p_chat_view);
            this.f36800j.setTextSize(1, 15.0f);
            this.f36801k.setTextSize(1, 12.0f);
            xdl0.m208327D0(t100.m186890d(21.0f), this.f36799i);
            xdl0.m208325C0(this.f36799i, t100.m186890d(21.0f));
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f36802l.setLayoutParams(layoutParams);
            boolean zMo35087yc = CoreModule.m29935P().m94656g().mo35087yc();
            boolean z2 = this.f36811u;
            if (zMo35087yc) {
                VFrame vFrame = this.f36792b;
                if (z2) {
                    xdl0.m208344M(vFrame, true);
                    xdl0.m208344M(this.f36798h, false);
                    xdl0.m208344M(this.f36802l, false);
                    this.f36791a.setBackgroundResource(c3c0.f78836q);
                } else {
                    xdl0.m208344M(vFrame, false);
                    m56144f(userActivityInfo);
                    xdl0.m208344M(this.f36809s, false);
                    this.f36791a.setBackgroundResource(getRootBg());
                }
            } else {
                setMessageKnowHimInSVIPUI(z2);
                xdl0.m208344M(this.f36792b, false);
                m56144f(userActivityInfo);
                if (this.f36811u) {
                    this.f36791a.setBackgroundResource(c3c0.f78836q);
                } else {
                    xdl0.m208344M(this.f36809s, false);
                    this.f36791a.setBackgroundResource(getRootBg());
                }
            }
            setTitle(z);
            str = "p_chat,femalevip_knowbetter";
        } else if (i == 1) {
            zvf0.m220402x("e_know_him_better", OMSDialogPositon.p_suggest_user_profile_info_view);
            xdl0.m208360X(this.f36798h, t100.f167268q);
            xdl0.m208327D0(t100.m186890d(22.0f), this.f36799i);
            xdl0.m208325C0(this.f36799i, t100.m186890d(22.0f));
            this.f36800j.setTextSize(1, 18.0f);
            this.f36801k.setTextSize(1, 13.0f);
            int i2 = t100.f167266o;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            layoutParams.topMargin = t100.f167261j;
            layoutParams.bottomMargin = 0;
            this.f36802l.setLayoutParams(layoutParams);
            this.f36791a.setBackgroundColor(getResources().getColor(a1c0.f67146a0));
            xdl0.m208344M(this.f36792b, false);
            this.f36802l.setBackgroundResource(getRootBg());
            this.f36811u = NullChecker.m81303a(userActivityInfo) && !userActivityInfo.actorPrivilege;
            m56144f(userActivityInfo);
            xdl0.m208344M(this.f36809s, this.f36811u);
            setTitle(z);
            str = "p_profile,femalevip_knowbetter";
        } else {
            str = "";
        }
        xdl0.m208329E0(this.f36791a, new View.OnClickListener() { // from class: l.l6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126683a.m56143e(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m56146h() {
        this.f36793c.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxPUUtGUUE2Q1hFWFFJNU0yTkhaN09BWlhXWlBPUzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzA1NDAwNDc2MzE5Mzk0MzI3fQ.png", 1);
        this.f36799i.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxWRVJYM0hFWFk3NEJKR0ZDVzVFUlpSUVRYMzRVWjE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTU5MDY5OTM1NDA4NzgzMDc4NH0.png", 1);
        this.f36797g.setTextColor(Color.parseColor("#EF8E44"));
        this.f36797g.setCompoundDrawablesWithIntrinsicBounds(c3c0.f78528G6, 0, 0, 0);
        this.f36810t.setTextColor(Color.parseColor("#EF8E44"));
        this.f36810t.setCompoundDrawablesWithIntrinsicBounds(c3c0.f78528G6, 0, 0, 0);
        this.f36809s.setBackgroundResource(c3c0.f78872u);
        this.f36804n.setBackgroundResource(c3c0.f78845r);
        this.f36807q.setBackgroundResource(c3c0.f78845r);
    }

    /* JADX INFO: renamed from: i */
    public final void m56147i() {
        zvf0.m220396r("e_know_him_better", this.f36812v == 2 ? OMSDialogPositon.p_chat_view : OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56141c(this);
        this.f36793c.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IjQzTDNQMlVGNVlRUlU3RFZSTTNZUVBaWTdZT0JRSzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDgzMDQ2OTAyODk4NTU4OTE0Mn0.png", 1);
        this.f36799i.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IlpENUFERlRQNTQyQ1E2UTdFVEhCN1k1NUZFTkhYRTE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE3Mjg0MDYxMDA1NTEzMjkyOH0.png", 1);
        setOnClickListener(new View.OnClickListener() { // from class: l.k6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121521a.m56142d(view);
            }
        });
        if (CoreModule.m29935P().m94656g().mo35054d9()) {
            m56146h();
        }
    }

    public void setLocked(boolean z) {
        this.f36811u = z;
    }

    public void setPage(int i) {
        this.f36812v = i;
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
