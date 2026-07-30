package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VText;
import p149l.c40;
import p149l.d30;
import p149l.jjb0;
import p149l.k96;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemInstantChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24821a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f24822b;

    /* JADX INFO: renamed from: c */
    public VText f24823c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f24824d;

    /* JADX INFO: renamed from: e */
    public VImage f24825e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f24826f;

    /* JADX INFO: renamed from: g */
    public VText f24827g;

    /* JADX INFO: renamed from: h */
    public VImage f24828h;

    /* JADX INFO: renamed from: i */
    public Act f24829i;

    /* JADX INFO: renamed from: j */
    public Conversation f24830j;

    /* JADX INFO: renamed from: k */
    public User f24831k;

    /* JADX INFO: renamed from: l */
    public Long f24832l;

    /* JADX INFO: renamed from: m */
    public c40 f24833m;

    public class ShaderBLToTRSpan extends ForegroundColorSpan {

        @NonNull
        @ColorInt
        int[] colors;
        float[] positions;
        String value;

        public ShaderBLToTRSpan(int i, @NonNull @ColorInt String str, int[] iArr, float[] fArr) {
            super(i);
            this.value = str;
            this.colors = iArr;
            this.positions = fArr;
        }

        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            float fMeasureText = textPaint.measureText(this.value);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = t100.f167261j;
            if (NullChecker.m81303a(fontMetrics)) {
                f = fontMetrics.descent - fontMetrics.ascent;
            }
            textPaint.setShader(new LinearGradient(0.0f, f, fMeasureText, 0.0f, this.colors, this.positions, Shader.TileMode.CLAMP));
        }
    }

    public ConversationItemInstantChatGuideView(Context context) {
        super(context);
        this.f24832l = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m40831f(View view) {
        k96.m145027a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m40832g(boolean z) {
        if (this.f24831k.isFemale()) {
            return z ? "她最近看过你" : "你喜欢了她";
        }
        return z ? "他最近看过你" : "你喜欢了他";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40833h() {
        CoreModule.f17545c.f19557C2.m163502o3(this.f24831k.f56011id, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40834i(View view) {
        if (NullChecker.m81303a(this.f24831k)) {
            zvf0.m220396r("e_odiamond_locked_match", OMSDialogPositon.p_messages_view);
        }
        C8456b.m47636o(this.f24829i, this.f24831k, "p_messages,odiamond_sayhi", new d30() { // from class: l.h96
            @Override // p149l.d30
            public final void call() {
                this.f106516a.m40833h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m40835j(View view) {
        this.f24833m.m105113b();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m40836k(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f24833m.m105113b();
        if (NullChecker.m81303a(this.f24831k)) {
            CoreModule.f17545c.f19557C2.m163502o3(this.f24831k.f56011id, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m40837l(View view) {
        c40.C16057b c16057b = new c40.C16057b(this.f24829i);
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        c40 c40VarM105153F = c16057b.m105156I(this.f24829i.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.i96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f112106a.m40835j(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.j96
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f116862a.m40836k(vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24833m = c40VarM105153F;
        c40VarM105153F.m105117f();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m40838m(Act act, Conversation conversation) {
        this.f24829i = act;
        this.f24830j = conversation;
        User userById = CoreModule.m29932K().getUserById(conversation.otherUser);
        this.f24831k = userById;
        if (userById == null) {
            return;
        }
        m40841p();
        m40844s();
        m40843r();
    }

    /* JADX INFO: renamed from: n */
    public final void m40839n(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strM40832g = m40832g(z);
        spannableStringBuilder.append((CharSequence) strM40832g);
        int length = strM40832g.length();
        spannableStringBuilder.setSpan(new ShaderBLToTRSpan(Color.parseColor("#9F6820"), strM40832g, new int[]{Color.parseColor("#9F6820"), Color.parseColor("#C58D32"), Color.parseColor("#9F6820")}, new float[]{0.2f, 0.5f, 0.8f}), 0, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
        spannableStringBuilder.append((CharSequence) " · ");
        int i = length + 3;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#C28B31")), length, i, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, i, 33);
        spannableStringBuilder.append((CharSequence) "点击按钮马上配对");
        this.f24827g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o */
    public final void m40840o() {
        boolean zIsPicVerificationVerified = this.f24831k.isPicVerificationVerified();
        VImage vImage = this.f24825e;
        if (zIsPicVerificationVerified) {
            vImage.setBackgroundResource(x2c0.f190302kj);
            xdl0.m208344M(this.f24825e, true);
        } else {
            xdl0.m208344M(vImage, false);
        }
        if (jjb0.m141784b()) {
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), this.f24831k, this.f24825e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40831f(this);
        this.f24823c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: p */
    public final void m40841p() {
        qib0.f154691G.m102331L0(this.f24821a, this.f24831k.m60124fp().profileSmall().formatted());
        this.f24823c.setText(this.f24831k.name);
        m40840o();
        m40842q(CoreModule.f17545c.f19557C2.m163508x3(this.f24830j));
        xdl0.m208344M(this.f24824d, this.f24825e.getVisibility() == 0 || this.f24826f.getVisibility() == 0);
        m40839n(CoreModule.f17545c.f19557C2.m163508x3(this.f24830j));
    }

    /* JADX INFO: renamed from: q */
    public final void m40842q(boolean z) {
        Settings settings;
        List<SettingGroups> list;
        int i = 0;
        xdl0.m208344M(this.f24826f, false);
        if (!z || (settings = this.f24831k.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || settings.settingGroups.get(0).live == null) {
            return;
        }
        switch (settings.settingGroups.get(0).live.wealthGrade) {
            case 30:
                i = x2c0.f189537M5;
                break;
            case 31:
                i = x2c0.f189568N5;
                break;
            case 32:
                i = x2c0.f189599O5;
                break;
            case 33:
                i = x2c0.f189630P5;
                break;
            case 34:
                i = x2c0.f189661Q5;
                break;
            case 35:
                i = x2c0.f189692R5;
                break;
        }
        if (i != 0) {
            xdl0.m208344M(this.f24826f, true);
            qib0.f154691G.m102354Y0(this.f24826f, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m40843r() {
        if (System.currentTimeMillis() - this.f24832l.longValue() <= 300) {
            return;
        }
        this.f24832l = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m81303a(this.f24831k)) {
            zvf0.m220402x("e_odiamond_locked_match", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40844s() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.f96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96455a.m40834i(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.g96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f101546a.m40837l(view);
            }
        });
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24832l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24832l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24832l = 0L;
    }
}
