package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class RTCAudioDumpSampleConfig {
    public boolean aec_near_in_enable = false;
    public boolean aec_far_in_enable = false;
    public boolean aec_far_in_ref_enable = false;
    public boolean aec_out_enable = false;
    public boolean agc_out_enable = false;
    public boolean ns_out_enable = false;
    public boolean ainr_out_enable = false;
    public boolean mix_out_enable = false;
    public boolean send2encoder_enable = false;
    public boolean audio_share_in_enable = false;
    public boolean audio_share_win_ref_enable = false;
    public boolean audio_share_out_enable = false;
    public boolean external_audio_in_enable = false;
    public boolean pitchfilter_out_enable = false;
    public boolean decoder_out_enable = false;
    public boolean front_aec_near_ref_enable = false;
    public boolean postprocess_out_enable = false;
    public boolean remotefilter_out_enable = false;
    public boolean push_audio_frame_in_enable = false;
    public boolean loopback_device_in_enable = false;

    public RTCAudioDumpSampleConfig() {
        reset();
    }

    private void reset() {
        this.aec_near_in_enable = false;
        this.aec_far_in_enable = false;
        this.aec_far_in_ref_enable = false;
        this.aec_out_enable = false;
        this.agc_out_enable = false;
        this.ns_out_enable = false;
        this.ainr_out_enable = false;
        this.mix_out_enable = false;
        this.send2encoder_enable = false;
        this.audio_share_in_enable = false;
        this.audio_share_win_ref_enable = false;
        this.audio_share_out_enable = false;
        this.external_audio_in_enable = false;
        this.pitchfilter_out_enable = false;
        this.decoder_out_enable = false;
        this.front_aec_near_ref_enable = false;
        this.postprocess_out_enable = false;
        this.remotefilter_out_enable = false;
        this.push_audio_frame_in_enable = false;
        this.loopback_device_in_enable = false;
    }

    public void AllMode() {
        this.aec_near_in_enable = true;
        this.aec_far_in_enable = true;
        this.aec_far_in_ref_enable = true;
        this.aec_out_enable = true;
        this.agc_out_enable = true;
        this.ns_out_enable = true;
        this.ainr_out_enable = true;
        this.mix_out_enable = true;
        this.send2encoder_enable = true;
        this.audio_share_in_enable = true;
        this.audio_share_win_ref_enable = true;
        this.audio_share_out_enable = true;
        this.external_audio_in_enable = true;
        this.pitchfilter_out_enable = true;
        this.decoder_out_enable = true;
        this.front_aec_near_ref_enable = true;
        this.postprocess_out_enable = true;
        this.remotefilter_out_enable = true;
        this.push_audio_frame_in_enable = true;
        this.loopback_device_in_enable = true;
    }

    public void NormalMode() {
        reset();
        this.aec_near_in_enable = true;
        this.aec_far_in_ref_enable = true;
        this.mix_out_enable = true;
    }

    @CalledByNative
    public boolean getAecFarIn() {
        return this.aec_far_in_enable;
    }

    @CalledByNative
    public boolean getAecFarInRef() {
        return this.aec_far_in_ref_enable;
    }

    @CalledByNative
    public boolean getAecNearIn() {
        return this.aec_near_in_enable;
    }

    @CalledByNative
    public boolean getAecOut() {
        return this.aec_out_enable;
    }

    @CalledByNative
    public boolean getAgcOut() {
        return this.agc_out_enable;
    }

    @CalledByNative
    public boolean getAinrOut() {
        return this.ainr_out_enable;
    }

    @CalledByNative
    public boolean getAudioShareIn() {
        return this.audio_share_in_enable;
    }

    @CalledByNative
    public boolean getAudioShareOut() {
        return this.audio_share_out_enable;
    }

    @CalledByNative
    public boolean getAudioShareWinRef() {
        return this.audio_share_win_ref_enable;
    }

    @CalledByNative
    public boolean getDecodeOut() {
        return this.decoder_out_enable;
    }

    @CalledByNative
    public boolean getExternalAudioIn() {
        return this.external_audio_in_enable;
    }

    @CalledByNative
    public boolean getFrontAecRef() {
        return this.front_aec_near_ref_enable;
    }

    @CalledByNative
    public boolean getLoopbackDeviceIn() {
        return this.loopback_device_in_enable;
    }

    @CalledByNative
    public boolean getMixOut() {
        return this.mix_out_enable;
    }

    @CalledByNative
    public boolean getNsOut() {
        return this.ns_out_enable;
    }

    @CalledByNative
    public boolean getPitchFilterOut() {
        return this.pitchfilter_out_enable;
    }

    @CalledByNative
    public boolean getPostProcessOut() {
        return this.postprocess_out_enable;
    }

    @CalledByNative
    public boolean getPushAudioFrameIn() {
        return this.push_audio_frame_in_enable;
    }

    @CalledByNative
    public boolean getRemoteFilterOut() {
        return this.remotefilter_out_enable;
    }

    @CalledByNative
    public boolean getSend2encoder() {
        return this.send2encoder_enable;
    }

    public String toString() {
        String strConcat = this.aec_near_in_enable ? "[\"aec_near_in\"," : "[";
        if (this.aec_far_in_enable) {
            strConcat = strConcat.concat("\"aec_far_in\",");
        }
        if (this.aec_far_in_ref_enable) {
            strConcat = strConcat.concat("\"aec_far_in_ref\",");
        }
        if (this.aec_out_enable) {
            strConcat = strConcat.concat("\"aec_out\",");
        }
        if (this.agc_out_enable) {
            strConcat = strConcat.concat("\"agc_out\",");
        }
        if (this.ns_out_enable) {
            strConcat = strConcat.concat("\"ns_out\",");
        }
        if (this.ainr_out_enable) {
            strConcat = strConcat.concat("\"ainr_out\",");
        }
        if (this.mix_out_enable) {
            strConcat = strConcat.concat("\"mix_out\",");
        }
        if (this.send2encoder_enable) {
            strConcat = strConcat.concat("\"send2encoder\",");
        }
        if (this.audio_share_in_enable) {
            strConcat = strConcat.concat("\"audio_share_in\",");
        }
        if (this.audio_share_win_ref_enable) {
            strConcat = strConcat.concat("\"audio_share_win_ref\",");
        }
        if (this.audio_share_out_enable) {
            strConcat = strConcat.concat("\"audio_share_out\",");
        }
        if (this.external_audio_in_enable) {
            strConcat = strConcat.concat("\"external_audio_in\",");
        }
        if (this.pitchfilter_out_enable) {
            strConcat = strConcat.concat("\"pitchfilter_out\",");
        }
        if (this.decoder_out_enable) {
            strConcat = strConcat.concat("\"decoder_out\",");
        }
        if (this.front_aec_near_ref_enable) {
            strConcat = strConcat.concat("\"front_aec_near_ref\",");
        }
        return strConcat.concat(Constants.AES_SUFFIX);
    }
}
