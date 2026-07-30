package com.hellogroup.p036mk.business.base.p037ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.fragment.BaseMkFragment;
import p153l.bec0;
import p153l.nxl;
import p153l.pcc0;

/* JADX INFO: loaded from: classes7.dex */
public class MKBaseProxyFragment extends BaseMkFragment {

    /* JADX INFO: renamed from: W */
    private nxl f12032W;

    /* JADX INFO: renamed from: X */
    protected MKWebView f12033X;

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: b4 */
    public int mo17792b4() {
        return bec0.f76367g;
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: f4 */
    public void mo17796f4(View view) {
        this.f12033X = (MKWebView) view.findViewById(pcc0.f151552f);
        nxl nxlVarM17809s4 = m17809s4();
        this.f12032W = nxlVarM17809s4;
        if (nxlVarM17809s4 != null) {
            nxlVarM17809s4.mo17971s(m17810t4(), "");
        }
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: m4 */
    public void mo17803m4() {
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(mo17792b4(), viewGroup, false);
        mo17796f4(viewInflate);
        return viewInflate;
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        nxl nxlVar = this.f12032W;
        if (nxlVar != null) {
            nxlVar.mo17963d();
        }
        super.onDestroy();
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        nxl nxlVar = this.f12032W;
        if (nxlVar != null) {
            nxlVar.mo17973u();
        }
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        nxl nxlVar = this.f12032W;
        if (nxlVar != null) {
            nxlVar.mo17974v();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public nxl m17809s4() {
        return null;
    }

    /* JADX INFO: renamed from: t4 */
    public String m17810t4() {
        return "";
    }
}
