package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchNewUiHeadView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.d90;
import p149l.e30;
import p149l.e51;
import p149l.i0g0;
import p149l.kn50;
import p149l.mjj;
import p149l.qc2;
import p149l.qib0;
import p149l.rw6;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zxz;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiHeadView extends OnlineMatchBaseHeadView {

    /* JADX INFO: renamed from: A */
    public VText f32757A;

    /* JADX INFO: renamed from: B */
    public int f32758B;

    /* JADX INFO: renamed from: C */
    public String f32759C;

    /* JADX INFO: renamed from: D */
    public CharSequence f32760D;

    /* JADX INFO: renamed from: E */
    public CharSequence f32761E;

    /* JADX INFO: renamed from: F */
    public CharSequence f32762F;

    /* JADX INFO: renamed from: a */
    public LinearLayout f32763a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f32764b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32765c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f32766d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32767e;

    /* JADX INFO: renamed from: f */
    public VImage f32768f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32769g;

    /* JADX INFO: renamed from: h */
    public VLinear f32770h;

    /* JADX INFO: renamed from: i */
    public VText f32771i;

    /* JADX INFO: renamed from: j */
    public VText f32772j;

    /* JADX INFO: renamed from: k */
    public VText f32773k;

    /* JADX INFO: renamed from: l */
    public TextView f32774l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f32775m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f32776n;

    /* JADX INFO: renamed from: o */
    public VImage f32777o;

    /* JADX INFO: renamed from: p */
    public VText f32778p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f32779q;

    /* JADX INFO: renamed from: r */
    public VImage f32780r;

    /* JADX INFO: renamed from: s */
    public VText f32781s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f32782t;

    /* JADX INFO: renamed from: u */
    public VImage f32783u;

    /* JADX INFO: renamed from: v */
    public VText f32784v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f32785w;

    /* JADX INFO: renamed from: x */
    public VImage f32786x;

    /* JADX INFO: renamed from: y */
    public VText f32787y;

    /* JADX INFO: renamed from: z */
    public VRelative f32788z;

    public OnlineMatchNewUiHeadView(@NonNull Context context) {
        super(context);
        this.f32758B = 0;
        this.f32759C = "";
        this.f32760D = "";
        this.f32761E = "";
        this.f32762F = "";
    }

    private String getCheckTxt() {
        String strM79302F = RemoteConfig.m79298x().m79302F("icebreaking_check_txt");
        if (TextUtils.isEmpty(strM79302F)) {
            return "查看更多";
        }
        try {
            String strOptString = new JSONObject(strM79302F).optString("content");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "查看更多";
        } catch (JSONException unused) {
            return "查看更多";
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m50367r(List list, final Tag tag, final Tag tag2) {
        return vwb.m200293G(list, new w9j() { // from class: l.wm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.m200293G(list, new w9j() { // from class: l.xm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m50370u(e30 e30Var, d90 d90Var) {
        if (d90Var == null) {
            e30Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(d90Var.mo110406c())) {
            e30Var.call(d90Var.mo110406c());
        } else if (TextUtils.isEmpty(d90Var.mo110409f())) {
            e30Var.call("");
        } else {
            e30Var.call(d90Var.mo110409f());
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m50371v(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m50374A(StringBuilder sb, List<Tag> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        int iMin = Math.min(list.size(), 3);
        for (int i = 0; i < iMin && this.f32758B < 8; i++) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("、");
            }
            this.f32758B++;
            sb.append(list.get(i).value);
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m50375B(User user) {
        return TEnum.equals(user.gender, "female") ? "她" : "他";
    }

    /* JADX INFO: renamed from: C */
    public final String m50376C(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = user.location.region.country;
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if ((!TextUtils.isEmpty(user.location.region.city) || !TextUtils.isEmpty(user.location.region.district)) && NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default")) {
            str2 = user.location.region.city + user.location.region.district;
        }
        if (!TextUtils.isEmpty(str2) && !user.isHideLocationFromSVip() && NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default")) {
            if (user.location.distance < 1000) {
                str = i0g0.f110325b.format(user.location.distance) + CoreModule.f17544b.getString(R$string.f20873U4);
            } else {
                str = i0g0.f110325b.format(user.location.distance / 1000.0f) + CoreModule.f17544b.getString(R$string.f20993i4);
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
    public final CharSequence m50377D(User user, User user2, String str) {
        CharSequence charSequenceM50379F = m50379F(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM50379F};
        if (!TextUtils.isEmpty(charSequenceM50379F)) {
            if (NullChecker.m81303a(this.f32780r)) {
                this.f32780r.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78524G2 : c3c0.f78497D2);
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m50392S("你们曾经在 " + str + " 擦肩而过", str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.m81303a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m50392S("你们曾擦肩而过过 " + user2.location.passby.count + " 次", String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m50388O(user, user2);
    }

    /* JADX INFO: renamed from: E */
    public final void m50378E(Act act, User user, final e30<String> e30Var) {
        if (e30Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            e30Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngM173860b = qc2.m173860b(new LatLng(doublePair.first, doublePair.second));
        mjj mjjVarM154842c = mjj.m154842c(act, false);
        if (latLngM173860b == null) {
            e30Var.call("");
        } else {
            mjjVarM154842c.m154844e(act, latLngM173860b.latitude, latLngM173860b.longitude, new e30() { // from class: l.um50
                @Override // p149l.e30
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m50370u(e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.vm50
                @Override // p149l.e30
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m50371v((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final CharSequence m50379F(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM200339n = vwb.m200339n(user2.profile.tags, new w9j() { // from class: l.en50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.ym50
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return "";
        }
        final ArrayList arrayListM200339n2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.fn50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.an50
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.gn50
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnlineMatchNewUiHeadView.m50367r(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM200339n2, comparator);
        Collections.sort(arrayListM200339n, comparator);
        ArrayList arrayListM200339n3 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.hn50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(vwb.m200346r(arrayListM200339n2, new w9j() { // from class: l.zm50
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (vwb.m200296J(arrayListM200339n3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("你们都喜欢：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListM200339n3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListM200339n3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m50392S(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: G */
    public final CharSequence m50380G(User user) {
        this.f32758B = 0;
        StringBuilder sb = new StringBuilder();
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f32758B++;
            sb.append("学生");
        } else {
            if (!TextUtils.isEmpty(profile.work.industry) && !TextUtils.equals(user.profile.work.industry, "其他") && !TextUtils.equals(user.profile.work.industry, "其它") && !TextUtils.equals(user.profile.work.industry, "学生")) {
                this.f32758B++;
                sb.append(user.profile.work.industry);
            }
            if (!TextUtils.isEmpty(user.profile.work.department) && !TextUtils.equals(user.profile.work.department, "其他") && !TextUtils.equals(user.profile.work.department, "其它") && !TextUtils.equals(user.profile.work.department, "学生")) {
                if (TextUtils.isEmpty(sb)) {
                    this.f32758B++;
                } else {
                    sb.append("·");
                }
                sb.append(user.profile.work.department);
            }
        }
        m50374A(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.in50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m50374A(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.jn50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m50374A(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.rm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m50374A(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.sm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m50374A(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.tm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m50392S(m50375B(user) + "的标签：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m50381H(User user, Question question) {
        Question questionM215900o3;
        if (vwb.m200296J(user.profile.answers)) {
            questionM215900o3 = null;
        } else {
            questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(user.profile.answers.get(0).question);
        }
        if (questionM215900o3 != null) {
            question = questionM215900o3;
        }
        if (question == null) {
            return "";
        }
        return "和" + m50375B(user) + "聊聊: " + question.text;
    }

    /* JADX INFO: renamed from: I */
    public final String m50382I(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? i0g0.m133869j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: J */
    public boolean m50383J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m50384K(User user, View view) {
        ((MessagesAct) xdl0.m208328E(this)).mo48974l().m120854w6("messages_thumbnail_left", user.f56011id);
        zvf0.m220396r("e_match_person_quickchat", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m50385L(List list, Act act, User user, User user2) {
        m50391R(act, user, user2, vwb.m200296J(list) ? null : (Question) list.get(0));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50386M(final Act act, final User user, final User user2) {
        final List<T> listQuery = CoreModule.f17553k.f91942e.query(null, null, 1);
        e51.m114742G(new Runnable() { // from class: l.cn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f81642a.m50385L(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m50387N(User user, User user2, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f32759C = m50376C(user);
        if (NullChecker.m81303a(this.f32776n)) {
            this.f32778p.setText(this.f32759C);
            xdl0.m208344M(this.f32776n, !TextUtils.isEmpty(this.f32759C));
        } else if (!TextUtils.isEmpty(this.f32759C)) {
            sb.append(this.f32759C);
        }
        this.f32760D = m50377D(user2, user, str);
        boolean zM81303a = NullChecker.m81303a(this.f32779q);
        String str2 = SignParameters.NEW_LINE;
        if (zM81303a) {
            this.f32781s.setText(this.f32760D);
            xdl0.m208344M(this.f32779q, !TextUtils.isEmpty(this.f32760D));
        } else if (!TextUtils.isEmpty(this.f32760D)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f32760D);
        }
        this.f32761E = m50380G(user);
        if (NullChecker.m81303a(this.f32782t)) {
            this.f32784v.setText(this.f32761E);
            xdl0.m208344M(this.f32782t, !TextUtils.isEmpty(this.f32761E));
        } else if (!TextUtils.isEmpty(this.f32761E)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f32761E);
        }
        this.f32762F = m50381H(user, question);
        if (NullChecker.m81303a(this.f32785w)) {
            this.f32787y.setText(this.f32762F);
            xdl0.m208344M(this.f32785w, !TextUtils.isEmpty(this.f32762F));
        } else {
            if (TextUtils.isEmpty(this.f32762F)) {
                return;
            }
            if (TextUtils.isEmpty(sb.toString())) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(this.f32762F);
        }
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m50388O(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.m81303a(this.f32780r)) {
            this.f32780r.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78488C2 : c3c0.f78920z2);
        }
        return m50392S("你们都在 " + user.profile.studies.school + " 上过学", user.profile.studies.school);
    }

    /* JADX INFO: renamed from: P */
    public final void m50389P(User user, User user2) {
        boolean z = CoreModule.f17545c.f19561E0.m203803z3(user2) || m50383J(user2);
        if (NullChecker.m81303a(this.f32771i)) {
            boolean zM50383J = m50383J(user2);
            VText vText = this.f32771i;
            if (zM50383J) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f32771i.getPaint().setFakeBoldText(true);
        }
        if (NullChecker.m81303a(this.f32773k) && !z) {
            this.f32773k.setText(" · " + user2.age + "岁");
            this.f32773k.setVisibility(0);
        }
        if (NullChecker.m81303a(this.f32765c)) {
            qib0.f154691G.m102341Q0(this.f32765c, rw6.m181386b(user).profileSmall());
        }
        if (m50383J(user2) || !NullChecker.m81303a(this.f32772j)) {
            return;
        }
        this.f32772j.setText(m50382I(user2));
    }

    /* JADX INFO: renamed from: Q */
    public final void m50390Q(final Act act, final User user, final User user2) {
        if (m50383J(user2)) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.bn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f76369a.m50386M(act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m50391R(Act act, final User user, final User user2, final Question question) {
        m50378E(act, user2, new e30() { // from class: l.dn50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87027a.m50387N(user2, user, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m50392S(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(ura.m195053e().m195057d().mo33699I4() ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: a */
    public void mo50307a(User user, int i) {
        if (user == null) {
            return;
        }
        if (user.inactivated) {
            qib0.f154691G.m102354Y0(getImageSmall(), CoreModule.m29935P().m94658i().mo158375f3());
            return;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (i == 100 || (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na()))) {
            qib0.f154691G.m102331L0(getImageSmall(), rw6.m181385a(user).profileSmall().formatted());
        } else {
            CoreModule.m29935P().m94658i().mo158474y2(getImageSmall(), rw6.m181385a(user).profileSmall(), i);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: b */
    public void mo50308b(User user, final User user2, Conversation conversation) {
        xdl0.m208329E0(this.f32763a, new View.OnClickListener() { // from class: l.qm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155281a.m50384K(user2, view);
            }
        });
        if (CoreModule.m29935P().m94658i().mo158216D()) {
            zxz.m220864h().m220873p(user2.f56011id, "headView", getTickleAnimContent(), getImageSmall());
        }
        String str = (NullChecker.m81303a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) ? "每人发送20句消息，即可成为正式好友" : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32757A.setText(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: c */
    public void mo50309c(User user, User user2) {
        m50389P(user, user2);
        m50390Q(m50394z(), user, user2);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: d */
    public void mo50310d(boolean z) {
        xdl0.m208344M(this.f32788z, z);
    }

    public VDraweeView getImageSmall() {
        return this.f32767e;
    }

    public FrameLayout getTickleAnimContent() {
        return this.f32769g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50393y(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f32771i.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f32772j.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f32773k.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f32774l.setTextColor(getResources().getColor(a1c0.f67155i));
            xdl0.m208346N(this.f32777o, c3c0.f78884v2);
            this.f32778p.setTextColor(getResources().getColor(a1c0.f67154h));
            xdl0.m208346N(this.f32780r, c3c0.f78911y2);
            this.f32781s.setTextColor(getResources().getColor(a1c0.f67154h));
            xdl0.m208346N(this.f32783u, c3c0.f78524G2);
            this.f32784v.setTextColor(getResources().getColor(a1c0.f67154h));
            xdl0.m208346N(this.f32786x, c3c0.f78551J2);
            this.f32787y.setTextColor(getResources().getColor(a1c0.f67154h));
            this.f32757A.setTextColor(getResources().getColor(a1c0.f67155i));
        }
        zvf0.m220402x("e_match_person_information", OMSDialogPositon.p_chat_view);
        this.f32774l.setText(getCheckTxt());
    }

    /* JADX INFO: renamed from: y */
    public final void m50393y(View view) {
        kn50.m146559a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MessagesAct m50394z() {
        return (MessagesAct) getContext();
    }

    public OnlineMatchNewUiHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32758B = 0;
        this.f32759C = "";
        this.f32760D = "";
        this.f32761E = "";
        this.f32762F = "";
    }
}
