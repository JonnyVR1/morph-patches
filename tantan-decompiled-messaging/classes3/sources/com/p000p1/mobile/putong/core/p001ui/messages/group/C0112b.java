package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.message.R;
import java.util.List;
import l.j7c0;
import l.l6c0;
import l.s7m;
import l.xdl0;
import l.y4c0;
import p003l.nbk;
import p003l.shk;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0112b implements s7m<shk> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f1704a;

    /* JADX INFO: renamed from: b */
    public shk f1705b;

    /* JADX INFO: renamed from: c */
    public GroupRemoveMemberAct f1706c;

    /* JADX INFO: renamed from: d */
    public C0111a f1707d;

    /* JADX INFO: renamed from: e */
    public VText f1708e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b$a */
    public static class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m2287b(C0112b c0112b, View view) {
            c0112b.f1704a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m2288c(C0112b c0112b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.x0, viewGroup, false);
            m2287b(c0112b, viewInflate);
            return viewInflate;
        }
    }

    public C0112b(GroupRemoveMemberAct groupRemoveMemberAct) {
        this.f1706c = groupRemoveMemberAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m2274i(View view) {
        this.f1705b.m7621I0(this.f1707d.m2262H());
        this.f1705b.m7620H0();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2275C0() {
        return this.f1706c;
    }

    /* JADX INFO: renamed from: d */
    public View m2276d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m2288c(this, layoutInflater, viewGroup);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m2279i1(shk shkVar) {
        this.f1705b = shkVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2278f(List list) {
        m2284n(list.size());
        this.f1705b.m7621I0(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2276d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m2280j(Menu menu) {
        this.f1706c.getMenuInflater().inflate(j7c0.a, menu);
        MenuItem menuItemFindItem = menu.findItem(y4c0.i2);
        this.f1708e = (VText) menuItemFindItem.getActionView().findViewById(y4c0.h5);
        xdl0.E0(menuItemFindItem.getActionView(), new View.OnClickListener() { // from class: l.thk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7492a.m2274i(view);
            }
        });
        m2284n(0);
    }

    /* JADX INFO: renamed from: k */
    public void m2281k(List<String> list) {
        this.f1707d.m2264J(list);
    }

    /* JADX INFO: renamed from: l */
    public void m2282l(ChatGroup chatGroup) {
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId());
        GroupRemoveMemberAct groupRemoveMemberAct = this.f1706c;
        groupRemoveMemberAct.setTitle(String.format("%1$s(%2$s)", groupRemoveMemberAct.string(R.string.S2), Integer.valueOf((chatGroup.memberCount - 1) - (zEquals ? 0 : chatGroup.adminUserIds.size()))));
    }

    /* JADX INFO: renamed from: m */
    public void m2283m(List<nbk> list) {
        this.f1707d.m2265K(list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public void m2284n(int i) {
        AppCompatTextView appCompatTextView = this.f1708e;
        if (appCompatTextView == null) {
            return;
        }
        PutongCoreMvpAct putongCoreMvpAct = this.f1706c;
        if (i <= 0) {
            appCompatTextView.setText(putongCoreMvpAct.string(R.string.W));
        } else {
            appCompatTextView.setText(putongCoreMvpAct.getString(R.string.Y, String.valueOf(i)));
        }
        this.f1708e.setEnabled(i > 0);
    }

    /* JADX INFO: renamed from: r */
    public void m2285r() {
        this.f1704a.setLayoutManager(new LinearLayoutManager(this.f1706c, 1, false));
        C0111a c0111a = new C0111a(this.f1706c, new C0111a.a() { // from class: l.uhk
            @Override // com.p000p1.mobile.putong.core.p001ui.messages.group.C0111a.a
            /* JADX INFO: renamed from: a */
            public final void mo2266a(List list) {
                this.f7986a.m2278f(list);
            }
        });
        this.f1707d = c0111a;
        this.f1704a.setAdapter(c0111a);
    }
}
