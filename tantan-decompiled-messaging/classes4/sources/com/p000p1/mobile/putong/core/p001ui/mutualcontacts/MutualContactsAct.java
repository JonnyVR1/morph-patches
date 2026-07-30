package com.p000p1.mobile.putong.core.p001ui.mutualcontacts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.ag3;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.qib0;
import l.rza;
import l.t0g0;
import l.u4c0;
import l.ut10;
import l.v9j;
import l.vt10;
import l.vwb;
import l.w9j;
import l.x2c0;
import rx.c;
import v.VDraweeView;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MutualContactsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VList f384c;

    /* JADX INFO: renamed from: d */
    public VText f385d;

    /* JADX INFO: renamed from: e */
    public String f386e;

    /* JADX INFO: renamed from: f */
    public boolean f387f = false;

    /* JADX INFO: renamed from: g */
    public C0025a f388g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct$a */
    public class C0025a extends a<Contact> {

        /* JADX INFO: renamed from: c */
        public List<Contact> f389c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public boolean f390d = true;

        public C0025a() {
        }

        /* JADX INFO: renamed from: e */
        public void m530e(int i) {
            if (getCount() - i >= 5 || !this.f390d) {
                return;
            }
            CoreModule.c.e0.s9(MutualContactsAct.this.f386e);
        }

        /* JADX INFO: renamed from: m */
        public View m532m(ViewGroup viewGroup, int i) {
            return MutualContactsAct.this.inflater().inflate(f6c0.ce, viewGroup, false);
        }

        /* JADX INFO: renamed from: p */
        public List<Contact> m533p() {
            return this.f389c;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m531j(View view, Contact contact, int i, int i2) {
            VDraweeView vDraweeViewFindViewById = view.findViewById(u4c0.L5);
            TextView textView = (TextView) view.findViewById(u4c0.ge);
            MutualContactsAct.m527i2(contact, vDraweeViewFindViewById, (TextView) view.findViewById(u4c0.n6));
            textView.setText(contact.name);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: t */
        public void m535t(MutualContactsLocalLookups mutualContactsLocalLookups) {
            this.f389c = mutualContactsLocalLookups.lookups;
            this.f390d = mutualContactsLocalLookups.next != null;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m523d2(Context context, String str, Boolean bool) {
        Intent intent = new Intent(context, (Class<?>) MutualContactsAct.class);
        intent.putExtra(SysnotifListener.KEY_USER_ID, str);
        intent.putExtra("is_matched", bool);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.widget.ListAdapter, com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct$a] */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m524e2(Bundle bundle) {
        this.f384c.setCrashLogFlag("MutualContactsAct");
        this.f384c.addHeaderView(m529c2(inflater(), this.f384c));
        ?? c0025a = new C0025a();
        this.f388g = c0025a;
        this.f384c.setAdapter((ListAdapter) c0025a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ c m525g2() {
        return CoreModule.c.e0.Ka(this.f386e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m526h2(User user) {
        this.f385d.setText(rza.J0(user.profile.contactLookups));
        this.f388g.m535t(user.profile.contactLookups);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m527i2(Contact contact, VDraweeView vDraweeView, TextView textView) {
        if (contact.thumbnailUri != null) {
            textView.setText("");
            vDraweeView.setBackgroundDrawable(null);
            qib0.G.Z0(vDraweeView, contact.thumbnailUri.toString());
            return;
        }
        if (NullChecker.a(contact.name)) {
            boolean zJ = t0g0.j(contact.name);
            String str = contact.name;
            textView.setText(zJ ? vwb.U(vwb.R(str.split(" "), new w9j() { // from class: l.tt10
                public final Object call(Object obj) {
                    String str2 = (String) obj;
                    return str2.substring(0, str2.length() > 0 ? 1 : 0).toUpperCase();
                }
            }), "") : str.substring(0, 1));
            vDraweeView.setBackgroundResource(x2c0.g0);
        } else {
            textView.setText("");
            vDraweeView.setBackgroundResource(x2c0.Rt);
        }
        qib0.G.o(vDraweeView);
    }

    /* JADX INFO: renamed from: b2 */
    public View m528b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ut10.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2 */
    public View m529c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vt10.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m528b2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.qt10
            public final void call(Object obj) {
                this.f18208a.m524e2((Bundle) obj);
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.rt10
            public final Object call() {
                return this.f18672a.m525g2();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.st10
            public final void call(Object obj) {
                this.f19281a.m526h2((User) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f386e = getIntent().getStringExtra(SysnotifListener.KEY_USER_ID);
        this.f387f = getIntent().getBooleanExtra("is_matched", false);
    }

    public List<Object> trackedArgs() {
        return vwb.f0(new Object[]{"other user id", this.f386e, ag3.c, "matched", Boolean.valueOf(this.f387f), ag3.b});
    }
}
