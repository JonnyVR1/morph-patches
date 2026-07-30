package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.UserActivityInfo;
import com.p051p1.mobile.putong.data.UserActivityInfoItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p153l.bnl0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jfz;
import p153l.jyb;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class MessageKnowHimLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageKnowHimLayout f37639a;

    /* JADX INFO: renamed from: b */
    public VFrame f37640b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f37641c;

    /* JADX INFO: renamed from: d */
    public TextView f37642d;

    /* JADX INFO: renamed from: e */
    public TextView f37643e;

    /* JADX INFO: renamed from: f */
    public VFrame f37644f;

    /* JADX INFO: renamed from: g */
    public TextView f37645g;

    /* JADX INFO: renamed from: h */
    public VLinear f37646h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f37647i;

    /* JADX INFO: renamed from: j */
    public TextView f37648j;

    /* JADX INFO: renamed from: k */
    public TextView f37649k;

    /* JADX INFO: renamed from: l */
    public VLinear f37650l;

    /* JADX INFO: renamed from: m */
    public MessageKnowHimItem f37651m;

    /* JADX INFO: renamed from: n */
    public View f37652n;

    /* JADX INFO: renamed from: o */
    public MessageKnowHimItem f37653o;

    /* JADX INFO: renamed from: p */
    public MessageKnowHimItem f37654p;

    /* JADX INFO: renamed from: q */
    public View f37655q;

    /* JADX INFO: renamed from: r */
    public MessageKnowHimItem f37656r;

    /* JADX INFO: renamed from: s */
    public VFrame f37657s;

    /* JADX INFO: renamed from: t */
    public TextView f37658t;

    /* JADX INFO: renamed from: u */
    public boolean f37659u;

    /* JADX INFO: renamed from: v */
    public int f37660v;

    public MessageKnowHimLayout(Context context) {
        super(context);
    }

    private int getRootBg() {
        return CoreModule.m30933P().m143410g().mo36090yc() ? ibc0.f114129s : ibc0.f114156v;
    }

    private void setMessageKnowHimInSVIPUI(boolean z) {
        bnl0.m105524M(this.f37647i, false);
        this.f37657s.setBackgroundResource(ibc0.f114194z1);
        this.f37658t.setCompoundDrawablesWithIntrinsicBounds(ibc0.f113812H6, 0, 0, 0);
        this.f37658t.setText("开通会员解锁");
        View view = this.f37652n;
        if (z) {
            view.setBackgroundResource(ibc0.f114084n);
            this.f37655q.setBackgroundResource(ibc0.f114084n);
        } else {
            view.setBackgroundResource(ibc0.f114120r);
            this.f37655q.setBackgroundResource(ibc0.f114120r);
        }
    }

    private void setTitle(boolean z) {
        if (CoreModule.m30933P().m143410g().mo36090yc()) {
            return;
        }
        String str = z ? "她" : "他";
        this.f37642d.setText(String.format("更了解%s", str));
        this.f37643e.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
        this.f37648j.setText(String.format("更了解%s", str));
        this.f37649k.setText(String.format("了解%s的性格，看%s是否和你合拍", str, str));
    }

    /* JADX INFO: renamed from: c */
    public final void m57324c(View view) {
        jfz.m144742a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m57325d(View view) {
        m57330i();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m57326e(String str, View view) {
        m57330i();
        if (this.f37659u) {
            if (CoreModule.m30933P().m143410g().mo36090yc()) {
                CoreModule.m30933P().m143410g().mo36089ya((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null, null, null);
            } else {
                CoreModule.m30933P().m143412i().mo34365Lf((Act) getContext(), str, Privilege.unlock_learn_about_him_module, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m57327f(@Nullable UserActivityInfo userActivityInfo) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(this.f37651m, this.f37653o, this.f37654p, this.f37656r);
        if (!NullChecker.m82486a(userActivityInfo) || userActivityInfo.activityInfos.size() < 4) {
            return;
        }
        for (int i = 0; i < arrayListM147507f0.size(); i++) {
            MessageKnowHimItem messageKnowHimItem = (MessageKnowHimItem) arrayListM147507f0.get(i);
            UserActivityInfoItem userActivityInfoItem = userActivityInfo.activityInfos.get(i);
            if (userActivityInfo.actorPrivilege) {
                messageKnowHimItem.m57321b(userActivityInfoItem.icon, userActivityInfoItem.value, userActivityInfoItem.category);
            } else {
                messageKnowHimItem.m57321b(userActivityInfoItem.icon, userActivityInfoItem.category, userActivityInfoItem.value);
            }
        }
        bnl0.m105524M(this.f37646h, true);
        bnl0.m105524M(this.f37650l, true);
    }

    /* JADX INFO: renamed from: g */
    public void m57328g(@Nullable UserActivityInfo userActivityInfo, boolean z) {
        final String str;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37650l.getLayoutParams();
        this.f37650l.setBackgroundColor(getResources().getColor(g9c0.f102807Y));
        int i = this.f37660v;
        if (i == 2) {
            i4g0.m138526x("e_know_him_better", OMSDialogPositon.p_chat_view);
            this.f37648j.setTextSize(1, 15.0f);
            this.f37649k.setTextSize(1, 12.0f);
            bnl0.m105507D0(qa00.m175859d(21.0f), this.f37647i);
            bnl0.m105505C0(this.f37647i, qa00.m175859d(21.0f));
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f37650l.setLayoutParams(layoutParams);
            boolean zMo36090yc = CoreModule.m30933P().m143410g().mo36090yc();
            boolean z2 = this.f37659u;
            if (zMo36090yc) {
                VFrame vFrame = this.f37640b;
                if (z2) {
                    bnl0.m105524M(vFrame, true);
                    bnl0.m105524M(this.f37646h, false);
                    bnl0.m105524M(this.f37650l, false);
                    this.f37639a.setBackgroundResource(ibc0.f114111q);
                } else {
                    bnl0.m105524M(vFrame, false);
                    m57327f(userActivityInfo);
                    bnl0.m105524M(this.f37657s, false);
                    this.f37639a.setBackgroundResource(getRootBg());
                }
            } else {
                setMessageKnowHimInSVIPUI(z2);
                bnl0.m105524M(this.f37640b, false);
                m57327f(userActivityInfo);
                if (this.f37659u) {
                    this.f37639a.setBackgroundResource(ibc0.f114111q);
                } else {
                    bnl0.m105524M(this.f37657s, false);
                    this.f37639a.setBackgroundResource(getRootBg());
                }
            }
            setTitle(z);
            str = "p_chat,femalevip_knowbetter";
        } else if (i == 1) {
            i4g0.m138526x("e_know_him_better", OMSDialogPositon.p_suggest_user_profile_info_view);
            bnl0.m105540X(this.f37646h, qa00.f156330q);
            bnl0.m105507D0(qa00.m175859d(22.0f), this.f37647i);
            bnl0.m105505C0(this.f37647i, qa00.m175859d(22.0f));
            this.f37648j.setTextSize(1, 18.0f);
            this.f37649k.setTextSize(1, 13.0f);
            int i2 = qa00.f156328o;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            layoutParams.topMargin = qa00.f156323j;
            layoutParams.bottomMargin = 0;
            this.f37650l.setLayoutParams(layoutParams);
            this.f37639a.setBackgroundColor(getResources().getColor(g9c0.f102810a0));
            bnl0.m105524M(this.f37640b, false);
            this.f37650l.setBackgroundResource(getRootBg());
            this.f37659u = NullChecker.m82486a(userActivityInfo) && !userActivityInfo.actorPrivilege;
            m57327f(userActivityInfo);
            bnl0.m105524M(this.f37657s, this.f37659u);
            setTitle(z);
            str = "p_profile,femalevip_knowbetter";
        } else {
            str = "";
        }
        bnl0.m105509E0(this.f37639a, new View.OnClickListener() { // from class: l.ifz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114722a.m57326e(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m57329h() {
        this.f37641c.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxPUUtGUUE2Q1hFWFFJNU0yTkhaN09BWlhXWlBPUzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzA1NDAwNDc2MzE5Mzk0MzI3fQ.png", 1);
        this.f37647i.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IkxWRVJYM0hFWFk3NEJKR0ZDVzVFUlpSUVRYMzRVWjE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTU5MDY5OTM1NDA4NzgzMDc4NH0.png", 1);
        this.f37645g.setTextColor(Color.parseColor("#EF8E44"));
        this.f37645g.setCompoundDrawablesWithIntrinsicBounds(ibc0.f113803G6, 0, 0, 0);
        this.f37658t.setTextColor(Color.parseColor("#EF8E44"));
        this.f37658t.setCompoundDrawablesWithIntrinsicBounds(ibc0.f113803G6, 0, 0, 0);
        this.f37657s.setBackgroundResource(ibc0.f114147u);
        this.f37652n.setBackgroundResource(ibc0.f114120r);
        this.f37655q.setBackgroundResource(ibc0.f114120r);
    }

    /* JADX INFO: renamed from: i */
    public final void m57330i() {
        i4g0.m138520r("e_know_him_better", this.f37660v == 2 ? OMSDialogPositon.p_chat_view : OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57324c(this);
        this.f37641c.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IjQzTDNQMlVGNVlRUlU3RFZSTTNZUVBaWTdZT0JRSzE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDgzMDQ2OTAyODk4NTU4OTE0Mn0.png", 1);
        this.f37647i.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IlpENUFERlRQNTQyQ1E2UTdFVEhCN1k1NUZFTkhYRTE0IiwidyI6NjYsImgiOjY3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE3Mjg0MDYxMDA1NTEzMjkyOH0.png", 1);
        setOnClickListener(new View.OnClickListener() { // from class: l.hfz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109356a.m57325d(view);
            }
        });
        if (CoreModule.m30933P().m143410g().mo36057d9()) {
            m57329h();
        }
    }

    public void setLocked(boolean z) {
        this.f37659u = z;
    }

    public void setPage(int i) {
        this.f37660v = i;
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
