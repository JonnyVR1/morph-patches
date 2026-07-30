package com.p046p1.mobile.putong.core.p053ui.mutualcontacts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VList;
import p147v.VText;
import p149l.AbstractC15503a;
import p149l.ag3;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.qib0;
import p149l.rza;
import p149l.t0g0;
import p149l.u4c0;
import p149l.ut10;
import p149l.v9j;
import p149l.vt10;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class MutualContactsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VList f32562c;

    /* JADX INFO: renamed from: d */
    public VText f32563d;

    /* JADX INFO: renamed from: e */
    public String f32564e;

    /* JADX INFO: renamed from: f */
    public boolean f32565f = false;

    /* JADX INFO: renamed from: g */
    public C8600a f32566g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct$a */
    public class C8600a extends AbstractC15503a<Contact> {

        /* JADX INFO: renamed from: c */
        public List<Contact> f32567c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public boolean f32568d = true;

        public C8600a() {
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: e */
        public void mo41518e(int i) {
            if (getCount() - i >= 5 || !this.f32568d) {
                return;
            }
            CoreModule.f17545c.f19639e0.m169539s9(MutualContactsAct.this.f32564e);
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return MutualContactsAct.this.inflater().inflate(f6c0.f95731ce, viewGroup, false);
        }

        @Override // p149l.AbstractC15503a
        /* JADX INFO: renamed from: p */
        public List<Contact> mo20404p() {
            return this.f32567c;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, Contact contact, int i, int i2) {
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(u4c0.f173909L5);
            TextView textView = (TextView) view.findViewById(u4c0.f174268ge);
            MutualContactsAct.m50102i2(contact, vDraweeView, (TextView) view.findViewById(u4c0.f174378n6));
            textView.setText(contact.name);
        }

        /* JADX INFO: renamed from: t */
        public void m50106t(MutualContactsLocalLookups mutualContactsLocalLookups) {
            this.f32567c = mutualContactsLocalLookups.lookups;
            this.f32568d = mutualContactsLocalLookups.next != null;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m50098d2(Context context, String str, Boolean bool) {
        Intent intent = new Intent(context, (Class<?>) MutualContactsAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("is_matched", bool);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m50099e2(Bundle bundle) {
        this.f32562c.setCrashLogFlag("MutualContactsAct");
        this.f32562c.addHeaderView(m50104c2(inflater(), this.f32562c));
        C8600a c8600a = new C8600a();
        this.f32566g = c8600a;
        this.f32562c.setAdapter((ListAdapter) c8600a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ C22306c m50100g2() {
        return CoreModule.f17545c.f19639e0.m169410Ka(this.f32564e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m50101h2(User user) {
        this.f32563d.setText(rza.m181730J0(user.profile.contactLookups));
        this.f32566g.m50106t(user.profile.contactLookups);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m50102i2(Contact contact, VDraweeView vDraweeView, TextView textView) {
        if (contact.thumbnailUri != null) {
            textView.setText("");
            vDraweeView.setBackgroundDrawable(null);
            qib0.f154691G.m102356Z0(vDraweeView, contact.thumbnailUri.toString());
            return;
        }
        if (NullChecker.m81303a(contact.name)) {
            boolean zM186869j = t0g0.m186869j(contact.name);
            String str = contact.name;
            textView.setText(zM186869j ? vwb.m200307U(vwb.m200304R(str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), new w9j() { // from class: l.tt10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    String str2 = (String) obj;
                    return str2.substring(0, str2.length() > 0 ? 1 : 0).toUpperCase();
                }
            }), "") : str.substring(0, 1));
            vDraweeView.setBackgroundResource(x2c0.f190157g0);
        } else {
            textView.setText("");
            vDraweeView.setBackgroundResource(x2c0.f189716Rt);
        }
        qib0.f154691G.m184725o(vDraweeView);
    }

    /* JADX INFO: renamed from: b2 */
    public View m50103b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ut10.m195273b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2 */
    public View m50104c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vt10.m199913b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m50103b2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.qt10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156291a.m50099e2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.rt10
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160937a.m50100g2();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.st10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166291a.m50101h2((User) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f32564e = getIntent().getStringExtra("user_id");
        this.f32565f = getIntent().getBooleanExtra("is_matched", false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.m200324f0("other user id", this.f32564e, ag3.f69254c, "matched", Boolean.valueOf(this.f32565f), ag3.f69253b);
    }
}
