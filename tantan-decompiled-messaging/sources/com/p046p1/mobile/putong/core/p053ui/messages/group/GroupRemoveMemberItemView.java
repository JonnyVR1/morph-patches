package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.nbk;
import p149l.qib0;
import p149l.tbk;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupRemoveMemberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f31791a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f31792b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31793c;

    /* JADX INFO: renamed from: d */
    public VText f31794d;

    /* JADX INFO: renamed from: e */
    public VText f31795e;

    /* JADX INFO: renamed from: f */
    public nbk f31796f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8526b f31797g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$a */
    public static class C8525a {
        /* JADX INFO: renamed from: b */
        public static void m49123b(GroupRemoveMemberItemView groupRemoveMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupRemoveMemberItemView.f31791a = (VLinear) viewGroup.getChildAt(0);
            groupRemoveMemberItemView.f31792b = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupRemoveMemberItemView.f31793c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            groupRemoveMemberItemView.f31794d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            groupRemoveMemberItemView.f31795e = (VText) viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$b */
    public interface InterfaceC8526b {
        /* JADX INFO: renamed from: d */
        void mo49124d(nbk nbkVar, boolean z);
    }

    public GroupRemoveMemberItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m49119g(View view) {
        C8525a.m49123b(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49120h(CompoundButton compoundButton, boolean z) {
        if (NullChecker.m81303a(this.f31797g)) {
            this.f31797g.mo49124d(this.f31796f, z);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m49121i(nbk nbkVar, int i, boolean z) {
        this.f31796f = nbkVar;
        xdl0.m208344M(this.f31791a, false);
        xdl0.m208344M(this.f31795e, false);
        if (i != 0) {
            if (i == 1) {
                xdl0.m208344M(this.f31795e, true);
                this.f31795e.setText(nbkVar.f138043f);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f31791a, true);
        this.f31792b.setChecked(z);
        if (nbkVar.f138041d) {
            qib0.f154691G.m102356Z0(this.f31793c, tbk.m187863j(nbkVar.f138045h));
        } else {
            qib0.f154691G.m102356Z0(this.f31793c, nbkVar.f138040c);
        }
        this.f31794d.setText(nbkVar.f138039b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49119g(this);
        this.f31792b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ehk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f91337a.m49120h(compoundButton, z);
            }
        });
    }

    public void setOnGroupMemberRemoveChangeListener(InterfaceC8526b interfaceC8526b) {
        this.f31797g = interfaceC8526b;
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
