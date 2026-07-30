package com.p051p1.mobile.putong.core.p058ui.mutualcontacts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VList;
import p151v.VText;
import p153l.AbstractC15610a;
import p153l.a9g0;
import p153l.adc0;
import p153l.c220;
import p153l.d220;
import p153l.dbc0;
import p153l.e1b;
import p153l.jyb;
import p153l.kec0;
import p153l.og3;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MutualContactsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VList f33410c;

    /* JADX INFO: renamed from: d */
    public VText f33411d;

    /* JADX INFO: renamed from: e */
    public String f33412e;

    /* JADX INFO: renamed from: f */
    public boolean f33413f = false;

    /* JADX INFO: renamed from: g */
    public C8763a f33414g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct$a */
    public class C8763a extends AbstractC15610a<Contact> {

        /* JADX INFO: renamed from: c */
        public List<Contact> f33415c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public boolean f33416d = true;

        public C8763a() {
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: e */
        public void mo42529e(int i) {
            if (getCount() - i >= 5 || !this.f33416d) {
                return;
            }
            CoreModule.f18264c.f20381e0.m116612s9(MutualContactsAct.this.f33412e);
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return MutualContactsAct.this.inflater().inflate(kec0.f125903je, viewGroup, false);
        }

        @Override // p153l.AbstractC15610a
        /* JADX INFO: renamed from: p */
        public List<Contact> mo21403p() {
            return this.f33415c;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, Contact contact, int i, int i2) {
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(adc0.f70031N5);
            TextView textView = (TextView) view.findViewById(adc0.f70409je);
            MutualContactsAct.m51285k2(contact, vDraweeView, (TextView) view.findViewById(adc0.f70503p6));
            textView.setText(contact.name);
        }

        /* JADX INFO: renamed from: t */
        public void m51289t(MutualContactsLocalLookups mutualContactsLocalLookups) {
            this.f33415c = mutualContactsLocalLookups.lookups;
            this.f33416d = mutualContactsLocalLookups.next != null;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m51281e2(Context context, String str, Boolean bool) {
        Intent intent = new Intent(context, (Class<?>) MutualContactsAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("is_matched", bool);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m51282g2(Bundle bundle) {
        this.f33410c.setCrashLogFlag("MutualContactsAct");
        this.f33410c.addHeaderView(m51287d2(inflater(), this.f33410c));
        C8763a c8763a = new C8763a();
        this.f33414g = c8763a;
        this.f33410c.setAdapter((ListAdapter) c8763a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ C22421c m51283h2() {
        return CoreModule.f18264c.f20381e0.m116483Ka(this.f33412e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m51284i2(User user) {
        this.f33411d.setText(e1b.m118952J0(user.profile.contactLookups));
        this.f33414g.m51289t(user.profile.contactLookups);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m51285k2(Contact contact, VDraweeView vDraweeView, TextView textView) {
        if (contact.thumbnailUri != null) {
            textView.setText("");
            vDraweeView.setBackgroundDrawable(null);
            uqb0.f180374G.m127140Z0(vDraweeView, contact.thumbnailUri.toString());
            return;
        }
        if (NullChecker.m82486a(contact.name)) {
            boolean zM96575j = a9g0.m96575j(contact.name);
            String str = contact.name;
            textView.setText(zM96575j ? jyb.m147490U(jyb.m147487R(str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), new qcj() { // from class: l.b220
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    String str2 = (String) obj;
                    return str2.substring(0, str2.length() > 0 ? 1 : 0).toUpperCase();
                }
            }), "") : str.substring(0, 1));
            vDraweeView.setBackgroundResource(dbc0.f87039h0);
        } else {
            textView.setText("");
            vDraweeView.setBackgroundResource(dbc0.f86167Fu);
        }
        uqb0.f180374G.m98798o(vDraweeView);
    }

    /* JADX INFO: renamed from: c2 */
    public View m51286c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c220.m107666b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public View m51287d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d220.m113658b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51286c2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.y120
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197073a.m51282g2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new pcj() { // from class: l.z120
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f202477a.m51283h2();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.a220
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67929a.m51284i2((User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f33412e = getIntent().getStringExtra("user_id");
        this.f33413f = getIntent().getBooleanExtra("is_matched", false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return jyb.m147507f0("other user id", this.f33412e, og3.f147188c, "matched", Boolean.valueOf(this.f33413f), og3.f147187b);
    }
}
