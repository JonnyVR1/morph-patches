package com.p046p1.mobile.putong.account.p050ui.camera;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.C15763az;
import p149l.x00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountVideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public x00 f16674A;

    /* JADX INFO: renamed from: z */
    public C15763az f16675z;

    /* JADX INFO: renamed from: M4 */
    public static void m28788M4(AccountVideoRecordFrag accountVideoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_music_content", musicContent);
        bundle.putBoolean("extra_has_video", z);
        bundle.putBoolean("extra_is_add_image", z2);
        bundle.putInt("extra_image_count", i);
        bundle.putString("extra_from", str);
        bundle.putBoolean("extra_show_only_photo", z3);
        bundle.putSerializable("extra_selected_images", arrayList);
        bundle.putString("extra_selected_folder_path", str2);
        accountVideoRecordFrag.setArguments(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16674A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        if (NullChecker.m81303a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m28789o() {
        this.f16674A.m206428P0();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f16674A.m206521y2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16675z = new C15763az(this);
        x00 x00Var = new x00(this);
        this.f16674A = x00Var;
        this.f16675z.mo51532C(x00Var);
        this.f16675z.m99600m0(getArguments());
    }
}
