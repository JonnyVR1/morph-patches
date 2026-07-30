package com.tencent.liteav.videodecoder;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14483d {

    /* JADX INFO: renamed from: a */
    private boolean f60789a = false;

    /* JADX INFO: renamed from: b */
    private void m85226b(C14482c c14482c) throws IOException {
        if (c14482c.m85222d("VUI: aspect_ratio_info_present_flag") && ((int) c14482c.m85207a(8, "VUI: aspect_ratio")) == 255) {
            c14482c.m85215b(16, "VUI: sar_width");
            c14482c.m85215b(16, "VUI: sar_height");
        }
        if (c14482c.m85222d("VUI: overscan_info_present_flag")) {
            c14482c.m85215b(1, "VUI: overscan_appropriate_flag");
        }
        if (c14482c.m85222d("VUI: video_signal_type_present_flag")) {
            c14482c.m85215b(3, "VUI: video_format");
            c14482c.m85215b(1, "VUI: video_full_range_flag");
            if (c14482c.m85222d("VUI: colour_description_present_flag")) {
                c14482c.m85215b(8, "VUI: colour_primaries");
                c14482c.m85215b(8, "VUI: transfer_characteristics");
                c14482c.m85215b(8, "VUI: matrix_coefficients");
            }
        }
        if (c14482c.m85222d("VUI: chroma_loc_info_present_flag")) {
            c14482c.m85216b("VUI chroma_sample_loc_type_top_field");
            c14482c.m85216b("VUI chroma_sample_loc_type_bottom_field");
        }
        if (c14482c.m85222d("VUI: timing_info_present_flag")) {
            c14482c.m85215b(32, "VUI: num_units_in_tick");
            c14482c.m85215b(32, "VUI: time_scale");
            c14482c.m85215b(1, "VUI: fixed_frame_rate_flag");
        }
        boolean zM85222d = c14482c.m85222d("VUI: nal_hrd_parameters_present_flag");
        if (zM85222d) {
            m85225a(c14482c);
        }
        boolean zM85222d2 = c14482c.m85222d("VUI: vcl_hrd_parameters_present_flag");
        if (zM85222d2) {
            m85225a(c14482c);
        }
        if (zM85222d || zM85222d2) {
            c14482c.m85215b(1, "VUI: low_delay_hrd_flag");
        }
        c14482c.m85215b(1, "VUI: pic_struct_present_flag");
        if (c14482c.m85224e("VUI: bitstream_restriction_flag")) {
            c14482c.m85210a(true, "VUI: set bitstream_restriction_flag");
            c14482c.m85222d("VUI: motion_vectors_over_pic_boundaries_flag");
            c14482c.m85216b("VUI max_bytes_per_pic_denom");
            c14482c.m85216b("VUI max_bits_per_mb_denom");
            c14482c.m85216b("VUI log2_max_mv_length_horizontal");
            c14482c.m85216b("VUI log2_max_mv_length_vertical");
            c14482c.m85216b("VUI num_reorder_frames");
            c14482c.m85220c(1, "VUI: max_dec_frame_buffering");
            return;
        }
        c14482c.m85210a(true, "VUI: set bitstream_restriction_flag");
        c14482c.m85210a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
        c14482c.m85220c(0, "VUI: max_bytes_per_pic_denom");
        c14482c.m85220c(0, "VUI: max_bits_per_mb_denom");
        c14482c.m85220c(10, "VUI: log2_max_mv_length_horizontal");
        c14482c.m85220c(10, "VUI: log2_max_mv_length_vertical");
        c14482c.m85220c(0, "VUI: num_reorder_frames");
        c14482c.m85220c(1, "VUI: max_dec_frame_buffering");
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85227a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C14482c c14482c = new C14482c(inputStream, byteArrayOutputStream);
        c14482c.m85215b(8, "NALU type");
        int iM85207a = (int) c14482c.m85207a(8, "SPS: profile_idc");
        c14482c.m85215b(8, "SPS: constraint_set_0-3_flag and reserved_zero_4bits");
        c14482c.m85207a(8, "SPS: level_idc");
        c14482c.m85216b("SPS: seq_parameter_set_id");
        if (iM85207a == 100 || iM85207a == 110 || iM85207a == 122 || iM85207a == 144) {
            if (c14482c.m85205a("SPS: chroma_format_idc") == 3) {
                c14482c.m85215b(1, "SPS: residual_color_transform_flag");
            }
            c14482c.m85216b("SPS: bit_depth_luma_minus8");
            c14482c.m85216b("SPS: bit_depth_chroma_minus8");
            c14482c.m85215b(1, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (c14482c.m85222d("SPS: seq_scaling_matrix_present_lag")) {
                for (int i = 0; i < 8; i++) {
                    if (c14482c.m85222d("SPS: seqScalingListPresentFlag")) {
                        if (i < 6) {
                            c14482c.m85219c(16);
                        } else {
                            c14482c.m85219c(64);
                        }
                    }
                }
            }
        }
        c14482c.m85216b("SPS: log2_max_frame_num_minus4");
        int iM85205a = c14482c.m85205a("SPS: pic_order_cnt_type");
        if (iM85205a == 0) {
            c14482c.m85216b("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (iM85205a == 1) {
            c14482c.m85215b(1, "SPS: delta_pic_order_always_zero_flag");
            c14482c.m85216b("SPS: offset_for_non_ref_pic");
            c14482c.m85216b("SPS: offset_for_top_to_bottom_field");
            int iM85205a2 = c14482c.m85205a("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i2 = 0; i2 < iM85205a2; i2++) {
                c14482c.m85216b("SPS: offsetForRefFrame [" + i2 + Constants.AES_SUFFIX);
            }
        }
        c14482c.m85205a("SPS: num_ref_frames");
        c14482c.m85215b(1, "SPS: gaps_in_frame_num_value_allowed_flag");
        c14482c.m85216b("SPS: pic_width_in_mbs_minus1");
        c14482c.m85216b("SPS: pic_height_in_map_units_minus1");
        if (!c14482c.m85222d("SPS: frame_mbs_only_flag")) {
            c14482c.m85215b(1, "SPS: mb_adaptive_frame_field_flag");
        }
        c14482c.m85215b(1, "SPS: direct_8x8_inference_flag");
        if (c14482c.m85222d("SPS: frame_cropping_flag")) {
            c14482c.m85216b("SPS: frame_crop_left_offset");
            c14482c.m85216b("SPS: frame_crop_right_offset");
            c14482c.m85216b("SPS: frame_crop_top_offset");
            c14482c.m85216b("SPS: frame_crop_bottom_offset");
        }
        if (c14482c.m85224e("SPS: vui_parameters_present_flag")) {
            c14482c.m85210a(true, "VUI set 1: ");
            m85226b(c14482c);
        } else {
            c14482c.m85210a(true, "VUI set 1: ");
            c14482c.m85210a(false, "VUI: aspect_ratio_info_present_flag");
            c14482c.m85210a(false, "VUI: overscan_info_present_flag");
            c14482c.m85210a(false, "VUI: video_signal_type_present_flag");
            c14482c.m85210a(false, "VUI: chroma_loc_info_present_flag");
            c14482c.m85210a(false, "VUI: timing_info_present_flag");
            c14482c.m85210a(false, "VUI: nal_hrd_parameters_present_flag");
            c14482c.m85210a(false, "VUI: vcl_hrd_parameters_present_flag");
            c14482c.m85210a(false, "VUI: pic_struct_present_flag");
            c14482c.m85210a(true, "VUI: bitstream_restriction_flag");
            c14482c.m85210a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
            c14482c.m85220c(0, "VUI: max_bytes_per_pic_denom");
            c14482c.m85220c(0, "VUI: max_bits_per_mb_denom");
            c14482c.m85220c(10, "VUI: log2_max_mv_length_horizontal");
            c14482c.m85220c(10, "VUI: log2_max_mv_length_vertical");
            c14482c.m85220c(0, "VUI: num_reorder_frames");
            c14482c.m85220c(1, "VUI: max_dec_frame_buffering");
        }
        c14482c.m85218c();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (this.f60789a) {
            String str = "";
            for (byte b : byteArray) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hexString;
            }
        }
        return byteArray;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85228a(byte[] bArr) throws IOException {
        if (this.f60789a) {
            String str = "";
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hexString;
            }
        }
        return m85227a(new ByteArrayInputStream(bArr));
    }

    /* JADX INFO: renamed from: a */
    private void m85225a(C14482c c14482c) throws IOException {
        int iM85205a = c14482c.m85205a("SPS: cpb_cnt_minus1");
        c14482c.m85215b(4, "HRD: bit_rate_scale");
        c14482c.m85215b(4, "HRD: cpb_size_scale");
        for (int i = 0; i <= iM85205a; i++) {
            c14482c.m85216b("HRD: bit_rate_value_minus1");
            c14482c.m85216b("HRD: cpb_size_value_minus1");
            c14482c.m85215b(1, "HRD: cbr_flag");
        }
        c14482c.m85215b(5, "HRD: initial_cpb_removal_delay_length_minus1");
        c14482c.m85215b(5, "HRD: cpb_removal_delay_length_minus1");
        c14482c.m85215b(5, "HRD: dpb_output_delay_length_minus1");
        c14482c.m85215b(5, "HRD: time_offset_length");
    }
}
