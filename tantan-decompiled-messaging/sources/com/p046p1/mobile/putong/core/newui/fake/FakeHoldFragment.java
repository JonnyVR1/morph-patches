package com.p046p1.mobile.putong.core.newui.fake;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class FakeHoldFragment extends Frag {

    /* JADX INFO: renamed from: A */
    public InterfaceC7844a f21433A;

    /* JADX INFO: renamed from: C */
    public Intent f21435C;

    /* JADX INFO: renamed from: z */
    public int f21436z = 16;

    /* JADX INFO: renamed from: B */
    public String f21434B = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.FakeHoldFragment$a */
    public interface InterfaceC7844a {
        /* JADX INFO: renamed from: a */
        void mo36397a(ArrayList<Media> arrayList, String str);

        default void onError() {
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static FakeHoldFragment m36395z4(int i, Intent intent, InterfaceC7844a interfaceC7844a) {
        FakeHoldFragment fakeHoldFragment = new FakeHoldFragment();
        fakeHoldFragment.f21436z = i;
        fakeHoldFragment.f21433A = interfaceC7844a;
        fakeHoldFragment.f21435C = intent;
        return fakeHoldFragment;
    }

    /* JADX INFO: renamed from: A4 */
    public void m36396A4(FragmentManager fragmentManager) {
        fragmentManager.m2567m().m2806e(this, null).mo2708j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Intent intent = this.f21435C;
        if (intent == null) {
            startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), this.f21436z);
        } else {
            startActivityForResult(intent, this.f21436z);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != this.f21436z) {
            return;
        }
        InterfaceC7844a interfaceC7844a = this.f21433A;
        if (interfaceC7844a != null) {
            if (i2 == -1) {
                this.f21433A.mo36397a((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
            } else {
                interfaceC7844a.onError();
            }
        }
        if (getFragmentManager() != null) {
            getFragmentManager().m2567m().mo2715r(this).mo2708j();
        }
    }
}
