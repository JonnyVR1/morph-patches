package com.p051p1.mobile.putong.core.newui.fake;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class FakeHoldFragment extends Frag {

    /* JADX INFO: renamed from: A */
    public InterfaceC7995a f22175A;

    /* JADX INFO: renamed from: C */
    public Intent f22177C;

    /* JADX INFO: renamed from: z */
    public int f22178z = 16;

    /* JADX INFO: renamed from: B */
    public String f22176B = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.FakeHoldFragment$a */
    public interface InterfaceC7995a {
        /* JADX INFO: renamed from: a */
        void mo37400a(ArrayList<Media> arrayList, String str);

        default void onError() {
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static FakeHoldFragment m37398z4(int i, Intent intent, InterfaceC7995a interfaceC7995a) {
        FakeHoldFragment fakeHoldFragment = new FakeHoldFragment();
        fakeHoldFragment.f22178z = i;
        fakeHoldFragment.f22175A = interfaceC7995a;
        fakeHoldFragment.f22177C = intent;
        return fakeHoldFragment;
    }

    /* JADX INFO: renamed from: A4 */
    public void m37399A4(FragmentManager fragmentManager) {
        fragmentManager.m2568m().m2807e(this, null).mo2709j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Intent intent = this.f22177C;
        if (intent == null) {
            startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), this.f22178z);
        } else {
            startActivityForResult(intent, this.f22178z);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != this.f22178z) {
            return;
        }
        InterfaceC7995a interfaceC7995a = this.f22175A;
        if (interfaceC7995a != null) {
            if (i2 == -1) {
                this.f22175A.mo37400a((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
            } else {
                interfaceC7995a.onError();
            }
        }
        if (getFragmentManager() != null) {
            getFragmentManager().m2568m().mo2716r(this).mo2709j();
        }
    }
}
