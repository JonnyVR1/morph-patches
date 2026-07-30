package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.baidu.mapapi.model.LatLng;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchNewUiHeadView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.fmj;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.q8g0;
import p153l.qcj;
import p153l.qv50;
import p153l.uqb0;
import p153l.ux6;
import p153l.w600;
import p153l.xc2;
import p153l.y20;
import p153l.z80;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiHeadView extends OnlineMatchBaseHeadView {

    /* JADX INFO: renamed from: A */
    public VText f33605A;

    /* JADX INFO: renamed from: B */
    public int f33606B;

    /* JADX INFO: renamed from: C */
    public String f33607C;

    /* JADX INFO: renamed from: D */
    public CharSequence f33608D;

    /* JADX INFO: renamed from: E */
    public CharSequence f33609E;

    /* JADX INFO: renamed from: F */
    public CharSequence f33610F;

    /* JADX INFO: renamed from: a */
    public LinearLayout f33611a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f33612b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33613c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f33614d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f33615e;

    /* JADX INFO: renamed from: f */
    public VImage f33616f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f33617g;

    /* JADX INFO: renamed from: h */
    public VLinear f33618h;

    /* JADX INFO: renamed from: i */
    public VText f33619i;

    /* JADX INFO: renamed from: j */
    public VText f33620j;

    /* JADX INFO: renamed from: k */
    public VText f33621k;

    /* JADX INFO: renamed from: l */
    public TextView f33622l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f33623m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f33624n;

    /* JADX INFO: renamed from: o */
    public VImage f33625o;

    /* JADX INFO: renamed from: p */
    public VText f33626p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f33627q;

    /* JADX INFO: renamed from: r */
    public VImage f33628r;

    /* JADX INFO: renamed from: s */
    public VText f33629s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f33630t;

    /* JADX INFO: renamed from: u */
    public VImage f33631u;

    /* JADX INFO: renamed from: v */
    public VText f33632v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f33633w;

    /* JADX INFO: renamed from: x */
    public VImage f33634x;

    /* JADX INFO: renamed from: y */
    public VText f33635y;

    /* JADX INFO: renamed from: z */
    public VRelative f33636z;

    public OnlineMatchNewUiHeadView(@NonNull Context context) {
        super(context);
        this.f33606B = 0;
        this.f33607C = "";
        this.f33608D = "";
        this.f33609E = "";
        this.f33610F = "";
    }

    private String getCheckTxt() {
        String strM80485F = RemoteConfig.m80481x().m80485F("icebreaking_check_txt");
        if (TextUtils.isEmpty(strM80485F)) {
            return "查看更多";
        }
        try {
            String strOptString = new JSONObject(strM80485F).optString("content");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "查看更多";
        } catch (JSONException unused) {
            return "查看更多";
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m51550r(List list, final Tag tag, final Tag tag2) {
        return jyb.m147476G(list, new qcj() { // from class: l.cv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - jyb.m147476G(list, new qcj() { // from class: l.dv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m51553u(y20 y20Var, z80 z80Var) {
        if (z80Var == null) {
            y20Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(z80Var.mo143671c())) {
            y20Var.call(z80Var.mo143671c());
        } else if (TextUtils.isEmpty(z80Var.mo143672f())) {
            y20Var.call("");
        } else {
            y20Var.call(z80Var.mo143672f());
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m51554v(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m51557A(StringBuilder sb, List<Tag> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        int iMin = Math.min(list.size(), 3);
        for (int i = 0; i < iMin && this.f33606B < 8; i++) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("、");
            }
            this.f33606B++;
            sb.append(list.get(i).value);
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m51558B(User user) {
        return TEnum.equals(user.gender, "female") ? "她" : "他";
    }

    /* JADX INFO: renamed from: C */
    public final String m51559C(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = user.location.region.country;
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if ((!TextUtils.isEmpty(user.location.region.city) || !TextUtils.isEmpty(user.location.region.district)) && NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default")) {
            str2 = user.location.region.city + user.location.region.district;
        }
        if (!TextUtils.isEmpty(str2) && !user.isHideLocationFromSVip() && NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default")) {
            if (user.location.distance < 1000) {
                str = q8g0.f156109b.format(user.location.distance) + CoreModule.f18263b.getString(R$string.f21615U4);
            } else {
                str = q8g0.f156109b.format(user.location.distance / 1000.0f) + CoreModule.f18263b.getString(R$string.f21735i4);
            }
            sb.append("居住在");
            sb.append(str2);
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        String str3 = user.profile.hometown;
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(", ");
            }
            sb.append("来自");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public final CharSequence m51560D(User user, User user2, String str) {
        CharSequence charSequenceM51562F = m51562F(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM51562F};
        if (!TextUtils.isEmpty(charSequenceM51562F)) {
            if (NullChecker.m82486a(this.f33628r)) {
                this.f33628r.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113799G2 : ibc0.f113772D2);
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m51575S("你们曾经在 " + str + " 擦肩而过", str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.m82486a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m51575S("你们曾擦肩而过过 " + user2.location.passby.count + " 次", String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m51571O(user, user2);
    }

    /* JADX INFO: renamed from: E */
    public final void m51561E(Act act, User user, final y20<String> y20Var) {
        if (y20Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            y20Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngM210088b = xc2.m210088b(new LatLng(doublePair.first, doublePair.second));
        fmj fmjVarM126236c = fmj.m126236c(act, false);
        if (latLngM210088b == null) {
            y20Var.call("");
        } else {
            fmjVarM126236c.m126239e(act, latLngM210088b.latitude, latLngM210088b.longitude, new y20() { // from class: l.av50
                @Override // p153l.y20
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m51553u(y20Var, (z80) obj);
                }
            }, new y20() { // from class: l.bv50
                @Override // p153l.y20
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m51554v((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final CharSequence m51562F(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM147522n = jyb.m147522n(user2.profile.tags, new qcj() { // from class: l.kv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.ev50
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return "";
        }
        final ArrayList arrayListM147522n2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.lv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.gv50
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.mv50
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnlineMatchNewUiHeadView.m51550r(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM147522n2, comparator);
        Collections.sort(arrayListM147522n, comparator);
        ArrayList arrayListM147522n3 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.nv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(jyb.m147529r(arrayListM147522n2, new qcj() { // from class: l.fv50
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (jyb.m147479J(arrayListM147522n3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("你们都喜欢：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListM147522n3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListM147522n3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m51575S(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: G */
    public final CharSequence m51563G(User user) {
        this.f33606B = 0;
        StringBuilder sb = new StringBuilder();
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f33606B++;
            sb.append("学生");
        } else {
            if (!TextUtils.isEmpty(profile.work.industry) && !TextUtils.equals(user.profile.work.industry, "其他") && !TextUtils.equals(user.profile.work.industry, "其它") && !TextUtils.equals(user.profile.work.industry, "学生")) {
                this.f33606B++;
                sb.append(user.profile.work.industry);
            }
            if (!TextUtils.isEmpty(user.profile.work.department) && !TextUtils.equals(user.profile.work.department, "其他") && !TextUtils.equals(user.profile.work.department, "其它") && !TextUtils.equals(user.profile.work.department, "学生")) {
                if (TextUtils.isEmpty(sb)) {
                    this.f33606B++;
                } else {
                    sb.append("·");
                }
                sb.append(user.profile.work.department);
            }
        }
        m51557A(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.ov50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m51557A(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.pv50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m51557A(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.xu50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m51557A(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.yu50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m51557A(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.zu50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m51575S(m51558B(user) + "的标签：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m51564H(User user, Question question) {
        Question questionM151465o3;
        if (jyb.m147479J(user.profile.answers)) {
            questionM151465o3 = null;
        } else {
            questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(user.profile.answers.get(0).question);
        }
        if (questionM151465o3 != null) {
            question = questionM151465o3;
        }
        if (question == null) {
            return "";
        }
        return "和" + m51558B(user) + "聊聊: " + question.text;
    }

    /* JADX INFO: renamed from: I */
    public final String m51565I(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? q8g0.m175804j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: J */
    public boolean m51566J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m51567K(User user, View view) {
        ((MessagesAct) bnl0.m105508E(this)).mo50158l().m111060w6("messages_thumbnail_left", user.f56859id);
        i4g0.m138520r("e_match_person_quickchat", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m51568L(List list, Act act, User user, User user2) {
        m51574R(act, user, user2, jyb.m147479J(list) ? null : (Question) list.get(0));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m51569M(final Act act, final User user, final User user2) {
        final List<T> listQuery = CoreModule.f18272k.f115537e.query(null, null, 1);
        l51.m152887G(new Runnable() { // from class: l.iv50
            @Override // java.lang.Runnable
            public final void run() {
                this.f117016a.m51568L(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m51570N(User user, User user2, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f33607C = m51559C(user);
        if (NullChecker.m82486a(this.f33624n)) {
            this.f33626p.setText(this.f33607C);
            bnl0.m105524M(this.f33624n, !TextUtils.isEmpty(this.f33607C));
        } else if (!TextUtils.isEmpty(this.f33607C)) {
            sb.append(this.f33607C);
        }
        this.f33608D = m51560D(user2, user, str);
        boolean zM82486a = NullChecker.m82486a(this.f33627q);
        String str2 = SignParameters.NEW_LINE;
        if (zM82486a) {
            this.f33629s.setText(this.f33608D);
            bnl0.m105524M(this.f33627q, !TextUtils.isEmpty(this.f33608D));
        } else if (!TextUtils.isEmpty(this.f33608D)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f33608D);
        }
        this.f33609E = m51563G(user);
        if (NullChecker.m82486a(this.f33630t)) {
            this.f33632v.setText(this.f33609E);
            bnl0.m105524M(this.f33630t, !TextUtils.isEmpty(this.f33609E));
        } else if (!TextUtils.isEmpty(this.f33609E)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f33609E);
        }
        this.f33610F = m51564H(user, question);
        if (NullChecker.m82486a(this.f33633w)) {
            this.f33635y.setText(this.f33610F);
            bnl0.m105524M(this.f33633w, !TextUtils.isEmpty(this.f33610F));
        } else {
            if (TextUtils.isEmpty(this.f33610F)) {
                return;
            }
            if (TextUtils.isEmpty(sb.toString())) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(this.f33610F);
        }
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m51571O(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.m82486a(this.f33628r)) {
            this.f33628r.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113763C2 : ibc0.f114195z2);
        }
        return m51575S("你们都在 " + user.profile.studies.school + " 上过学", user.profile.studies.school);
    }

    /* JADX INFO: renamed from: P */
    public final void m51572P(User user, User user2) {
        boolean z = CoreModule.f18264c.f20303E0.m141091z3(user2) || m51566J(user2);
        if (NullChecker.m82486a(this.f33619i)) {
            boolean zM51566J = m51566J(user2);
            VText vText = this.f33619i;
            if (zM51566J) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f33619i.getPaint().setFakeBoldText(true);
        }
        if (NullChecker.m82486a(this.f33621k) && !z) {
            this.f33621k.setText(" · " + user2.age + "岁");
            this.f33621k.setVisibility(0);
        }
        if (NullChecker.m82486a(this.f33613c)) {
            uqb0.f180374G.m127125Q0(this.f33613c, ux6.m198404b(user).profileSmall());
        }
        if (m51566J(user2) || !NullChecker.m82486a(this.f33620j)) {
            return;
        }
        this.f33620j.setText(m51565I(user2));
    }

    /* JADX INFO: renamed from: Q */
    public final void m51573Q(final Act act, final User user, final User user2) {
        if (m51566J(user2)) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.hv50
            @Override // java.lang.Runnable
            public final void run() {
                this.f111732a.m51569M(act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m51574R(Act act, final User user, final User user2, final Question question) {
        m51561E(act, user2, new y20() { // from class: l.jv50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122768a.m51570N(user2, user, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m51575S(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(gta.m132210e().m132214d().mo34702I4() ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: a */
    public void mo51490a(User user, int i) {
        if (user == null) {
            return;
        }
        if (user.inactivated) {
            uqb0.f180374G.m127138Y0(getImageSmall(), CoreModule.m30933P().m143412i().mo180467f3());
            return;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (i == 100 || (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na()))) {
            uqb0.f180374G.m127115L0(getImageSmall(), ux6.m198403a(user).profileSmall().formatted());
        } else {
            CoreModule.m30933P().m143412i().mo180566y2(getImageSmall(), ux6.m198403a(user).profileSmall(), i);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: b */
    public void mo51491b(User user, final User user2, Conversation conversation) {
        bnl0.m105509E0(this.f33611a, new View.OnClickListener() { // from class: l.wu50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190839a.m51567K(user2, view);
            }
        });
        if (CoreModule.m30933P().m143412i().mo180308D()) {
            w600.m205009h().m205018p(user2.f56859id, "headView", getTickleAnimContent(), getImageSmall());
        }
        String str = (NullChecker.m82486a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) ? "每人发送20句消息，即可成为正式好友" : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33605A.setText(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: c */
    public void mo51492c(User user, User user2) {
        m51572P(user, user2);
        m51573Q(m51577z(), user, user2);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: d */
    public void mo51493d(boolean z) {
        bnl0.m105524M(this.f33636z, z);
    }

    public VDraweeView getImageSmall() {
        return this.f33615e;
    }

    public FrameLayout getTickleAnimContent() {
        return this.f33617g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51576y(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f33619i.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f33620j.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f33621k.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f33622l.setTextColor(getResources().getColor(g9c0.f102819i));
            bnl0.m105526N(this.f33625o, ibc0.f114159v2);
            this.f33626p.setTextColor(getResources().getColor(g9c0.f102818h));
            bnl0.m105526N(this.f33628r, ibc0.f114186y2);
            this.f33629s.setTextColor(getResources().getColor(g9c0.f102818h));
            bnl0.m105526N(this.f33631u, ibc0.f113799G2);
            this.f33632v.setTextColor(getResources().getColor(g9c0.f102818h));
            bnl0.m105526N(this.f33634x, ibc0.f113826J2);
            this.f33635y.setTextColor(getResources().getColor(g9c0.f102818h));
            this.f33605A.setTextColor(getResources().getColor(g9c0.f102819i));
        }
        i4g0.m138526x("e_match_person_information", OMSDialogPositon.p_chat_view);
        this.f33622l.setText(getCheckTxt());
    }

    /* JADX INFO: renamed from: y */
    public final void m51576y(View view) {
        qv50.m178252a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MessagesAct m51577z() {
        return (MessagesAct) getContext();
    }

    public OnlineMatchNewUiHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33606B = 0;
        this.f33607C = "";
        this.f33608D = "";
        this.f33609E = "";
        this.f33610F = "";
    }
}
