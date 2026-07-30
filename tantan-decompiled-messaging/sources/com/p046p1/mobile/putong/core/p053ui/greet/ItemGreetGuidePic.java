package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetGuidePic;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VText;
import p149l.e30;
import p149l.i4q;
import p149l.jo0;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.qib0;
import p149l.szb0;
import p149l.vwb;
import p149l.w9j;
import p149l.x19;
import p149l.xaj0;
import p149l.xdl0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGreetGuidePic extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f29435a;

    /* JADX INFO: renamed from: b */
    public TextView f29436b;

    /* JADX INFO: renamed from: c */
    public VText f29437c;

    public ItemGreetGuidePic(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m45792C(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m45794L(String str, View view) {
        m45808Q(str);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m45798v(String str, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else if (i == 40046) {
                CoreModule.f17545c.f19642f0.m32902ap(str);
                return;
            } else {
                yij0.m214926D(th);
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                lsi0.m151595y("照片含有违规内容，请更换后再试");
                return;
            } else {
                yij0.m214926D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f55778o));
            return;
        }
        if (x19.m206695e(tantanForbidden)) {
            lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
        } else if (x19.m206694d(tantanForbidden)) {
            lsi0.m151595y(tantanForbidden.message);
        } else {
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m45801F(View view) {
        i4q.m134367a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final C22306c<xaj0<List<Media>, List<String>, String>> m45802G(final List<Media> list) {
        return (!vwb.m200296J(list) && (list.get(0) instanceof Picture) && qib0.f154703R.m94727c()) ? qib0.f154703R.m94726b(Uri.parse(list.get(0).url).getPath()).map(new w9j() { // from class: l.g4q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return xaj0.m207578a(list, ((Boolean) xaj0Var.f191751a).booleanValue() ? (List) xaj0Var.f191752b : null, !TextUtils.isEmpty((CharSequence) xaj0Var.f191753c) ? (String) xaj0Var.f191753c : "");
            }
        }) : C22306c.just(xaj0.m207578a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.greet.ItemGreetGuidePic.1
        }, ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22306c m45803K(String str, xaj0 xaj0Var) {
        return m45807P(str, (List) xaj0Var.f191751a, (List) xaj0Var.f191752b, (String) xaj0Var.f191753c);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m45804M(String str, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.m81303a(intent)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(arrayList)) {
            return true;
        }
        m45805N(str, arrayList);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void m45805N(final String str, List<Media> list) {
        act().duringCreated(new lsx(list, false).flatMap(new w9j() { // from class: l.b4q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73395a.m45802G((List) obj);
            }
        }).observeOn(jo0.m142408a()).last().compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.c4q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return ya5.m213795K((List) xaj0Var.f191751a, "greeting", null, UploadSource.get("chat")).map(new w9j() { // from class: l.h4q
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        xaj0 xaj0Var2 = xaj0Var;
                        return xaj0.m207578a((List) obj2, (List) xaj0Var2.f191752b, (String) xaj0Var2.f191753c);
                    }
                });
            }
        }).compose(mkd0.m154951C()).switchMap(new w9j() { // from class: l.d4q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84333a.m45803K(str, (xaj0) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.e4q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemGreetGuidePic.m45792C((Message) obj);
            }
        }, new e30() { // from class: l.f4q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemGreetGuidePic.m45798v(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m45806O(final String str) {
        zvf0.m220402x("e_city_cover_send_pic", act().pageId());
        this.f29435a.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.z3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201388a.m45794L(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final C22306c<Message> m45807P(String str, List<Media> list, List<String> list2, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!vwb.m200296J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return CoreModule.f17545c.f19678r0.m34149u6(str, Channel.get(Channel.city_c), messageNew_, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m45808Q(final String str) {
        zvf0.m220396r("e_city_cover_send_pic", act().pageId());
        ((Act) getContext()).startActivityForResult(MediaPickerAct.m78919X1(getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle("发送").needClickPreview(true).withFromType(14).build()), new C4317a.a() { // from class: l.a4q
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f67552a.m45804M(str, i, i2, intent);
            }
        });
        ((Act) getContext()).overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45801F(this);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
