package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dek;
import p153l.jek;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupRemoveMemberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f32639a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f32640b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32641c;

    /* JADX INFO: renamed from: d */
    public VText f32642d;

    /* JADX INFO: renamed from: e */
    public VText f32643e;

    /* JADX INFO: renamed from: f */
    public dek f32644f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8689b f32645g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$a */
    public static class C8688a {
        /* JADX INFO: renamed from: b */
        public static void m50306b(GroupRemoveMemberItemView groupRemoveMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupRemoveMemberItemView.f32639a = (VLinear) viewGroup.getChildAt(0);
            groupRemoveMemberItemView.f32640b = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupRemoveMemberItemView.f32641c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            groupRemoveMemberItemView.f32642d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            groupRemoveMemberItemView.f32643e = (VText) viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$b */
    public interface InterfaceC8689b {
        /* JADX INFO: renamed from: d */
        void mo50307d(dek dekVar, boolean z);
    }

    public GroupRemoveMemberItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m50302g(View view) {
        C8688a.m50306b(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m50303h(CompoundButton compoundButton, boolean z) {
        if (NullChecker.m82486a(this.f32645g)) {
            this.f32645g.mo50307d(this.f32644f, z);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m50304i(dek dekVar, int i, boolean z) {
        this.f32644f = dekVar;
        bnl0.m105524M(this.f32639a, false);
        bnl0.m105524M(this.f32643e, false);
        if (i != 0) {
            if (i == 1) {
                bnl0.m105524M(this.f32643e, true);
                this.f32643e.setText(dekVar.f88041f);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f32639a, true);
        this.f32640b.setChecked(z);
        if (dekVar.f88039d) {
            uqb0.f180374G.m127140Z0(this.f32641c, jek.m144578j(dekVar.f88043h));
        } else {
            uqb0.f180374G.m127140Z0(this.f32641c, dekVar.f88038c);
        }
        this.f32642d.setText(dekVar.f88037b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50302g(this);
        this.f32640b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ujk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f179221a.m50303h(compoundButton, z);
            }
        });
    }

    public void setOnGroupMemberRemoveChangeListener(InterfaceC8689b interfaceC8689b) {
        this.f32645g = interfaceC8689b;
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
