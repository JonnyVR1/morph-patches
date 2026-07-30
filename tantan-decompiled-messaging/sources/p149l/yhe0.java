package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class yhe0 extends z23 {

    /* JADX INFO: renamed from: A */
    public boolean f198297A;

    /* JADX INFO: renamed from: B */
    public int f198298B;

    /* JADX INFO: renamed from: C */
    public int f198299C;

    /* JADX INFO: renamed from: D */
    public int f198300D;

    /* JADX INFO: renamed from: E */
    public boolean f198301E;

    /* JADX INFO: renamed from: F */
    public boolean f198302F;

    /* JADX INFO: renamed from: G */
    public boolean f198303G;

    /* JADX INFO: renamed from: H */
    public int f198304H;

    /* JADX INFO: renamed from: I */
    public int f198305I;

    /* JADX INFO: renamed from: J */
    public int f198306J;

    /* JADX INFO: renamed from: K */
    public int f198307K;

    /* JADX INFO: renamed from: L */
    public int[] f198308L;

    /* JADX INFO: renamed from: M */
    public yqk0 f198309M;

    /* JADX INFO: renamed from: N */
    public dtd0 f198310N;

    /* JADX INFO: renamed from: O */
    public int f198311O;

    /* JADX INFO: renamed from: a */
    public int f198312a;

    /* JADX INFO: renamed from: b */
    public boolean f198313b;

    /* JADX INFO: renamed from: c */
    public boolean f198314c;

    /* JADX INFO: renamed from: d */
    public boolean f198315d;

    /* JADX INFO: renamed from: e */
    public int f198316e;

    /* JADX INFO: renamed from: f */
    public boolean f198317f;

    /* JADX INFO: renamed from: g */
    public boolean f198318g;

    /* JADX INFO: renamed from: h */
    public boolean f198319h;

    /* JADX INFO: renamed from: i */
    public m35 f198320i;

    /* JADX INFO: renamed from: j */
    public int f198321j;

    /* JADX INFO: renamed from: k */
    public int f198322k;

    /* JADX INFO: renamed from: l */
    public int f198323l;

    /* JADX INFO: renamed from: m */
    public int f198324m;

    /* JADX INFO: renamed from: n */
    public int f198325n;

    /* JADX INFO: renamed from: o */
    public int f198326o;

    /* JADX INFO: renamed from: p */
    public boolean f198327p;

    /* JADX INFO: renamed from: q */
    public int f198328q;

    /* JADX INFO: renamed from: r */
    public long f198329r;

    /* JADX INFO: renamed from: s */
    public boolean f198330s;

    /* JADX INFO: renamed from: t */
    public boolean f198331t;

    /* JADX INFO: renamed from: u */
    public boolean f198332u;

    /* JADX INFO: renamed from: v */
    public boolean f198333v;

    /* JADX INFO: renamed from: w */
    public boolean f198334w;

    /* JADX INFO: renamed from: x */
    public boolean f198335x;

    /* JADX INFO: renamed from: y */
    public int f198336y;

    /* JADX INFO: renamed from: z */
    public int f198337z;

    /* JADX INFO: renamed from: a */
    private static yqk0 m214816a(br3 br3Var) throws IOException {
        yqk0 yqk0Var = new yqk0();
        boolean zM103445f = br3Var.m103445f("VUI: aspect_ratio_info_present_flag");
        yqk0Var.f199572a = zM103445f;
        if (zM103445f) {
            k11 k11VarM144137a = k11.m144137a((int) br3Var.m103446g(8, "VUI: aspect_ratio"));
            yqk0Var.f199596y = k11VarM144137a;
            if (k11VarM144137a == k11.f120532b) {
                yqk0Var.f199573b = (int) br3Var.m103446g(16, "VUI: sar_width");
                yqk0Var.f199574c = (int) br3Var.m103446g(16, "VUI: sar_height");
            }
        }
        boolean zM103445f2 = br3Var.m103445f("VUI: overscan_info_present_flag");
        yqk0Var.f199575d = zM103445f2;
        if (zM103445f2) {
            yqk0Var.f199576e = br3Var.m103445f("VUI: overscan_appropriate_flag");
        }
        boolean zM103445f3 = br3Var.m103445f("VUI: video_signal_type_present_flag");
        yqk0Var.f199577f = zM103445f3;
        if (zM103445f3) {
            yqk0Var.f199578g = (int) br3Var.m103446g(3, "VUI: video_format");
            yqk0Var.f199579h = br3Var.m103445f("VUI: video_full_range_flag");
            boolean zM103445f4 = br3Var.m103445f("VUI: colour_description_present_flag");
            yqk0Var.f199580i = zM103445f4;
            if (zM103445f4) {
                yqk0Var.f199581j = (int) br3Var.m103446g(8, "VUI: colour_primaries");
                yqk0Var.f199582k = (int) br3Var.m103446g(8, "VUI: transfer_characteristics");
                yqk0Var.f199583l = (int) br3Var.m103446g(8, "VUI: matrix_coefficients");
            }
        }
        boolean zM103445f5 = br3Var.m103445f("VUI: chroma_loc_info_present_flag");
        yqk0Var.f199584m = zM103445f5;
        if (zM103445f5) {
            yqk0Var.f199585n = br3Var.m103450l("VUI chroma_sample_loc_type_top_field");
            yqk0Var.f199586o = br3Var.m103450l("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean zM103445f6 = br3Var.m103445f("VUI: timing_info_present_flag");
        yqk0Var.f199587p = zM103445f6;
        if (zM103445f6) {
            yqk0Var.f199588q = (int) br3Var.m103446g(32, "VUI: num_units_in_tick");
            yqk0Var.f199589r = (int) br3Var.m103446g(32, "VUI: time_scale");
            yqk0Var.f199590s = br3Var.m103445f("VUI: fixed_frame_rate_flag");
        }
        boolean zM103445f7 = br3Var.m103445f("VUI: nal_hrd_parameters_present_flag");
        if (zM103445f7) {
            yqk0Var.f199593v = m214818c(br3Var);
        }
        boolean zM103445f8 = br3Var.m103445f("VUI: vcl_hrd_parameters_present_flag");
        if (zM103445f8) {
            yqk0Var.f199594w = m214818c(br3Var);
        }
        if (zM103445f7 || zM103445f8) {
            yqk0Var.f199591t = br3Var.m103445f("VUI: low_delay_hrd_flag");
        }
        yqk0Var.f199592u = br3Var.m103445f("VUI: pic_struct_present_flag");
        if (br3Var.m103445f("VUI: bitstream_restriction_flag")) {
            yqk0.C21479a c21479a = new yqk0.C21479a();
            yqk0Var.f199595x = c21479a;
            c21479a.f199597a = br3Var.m103445f("VUI: motion_vectors_over_pic_boundaries_flag");
            yqk0Var.f199595x.f199598b = br3Var.m103450l("VUI max_bytes_per_pic_denom");
            yqk0Var.f199595x.f199599c = br3Var.m103450l("VUI max_bits_per_mb_denom");
            yqk0Var.f199595x.f199600d = br3Var.m103450l("VUI log2_max_mv_length_horizontal");
            yqk0Var.f199595x.f199601e = br3Var.m103450l("VUI log2_max_mv_length_vertical");
            yqk0Var.f199595x.f199602f = br3Var.m103450l("VUI num_reorder_frames");
            yqk0Var.f199595x.f199603g = br3Var.m103450l("VUI max_dec_frame_buffering");
        }
        return yqk0Var;
    }

    /* JADX INFO: renamed from: b */
    public static yhe0 m214817b(InputStream inputStream) throws IOException {
        br3 br3Var = new br3(inputStream);
        yhe0 yhe0Var = new yhe0();
        yhe0Var.f198328q = (int) br3Var.m103446g(8, "SPS: profile_idc");
        yhe0Var.f198330s = br3Var.m103445f("SPS: constraint_set_0_flag");
        yhe0Var.f198331t = br3Var.m103445f("SPS: constraint_set_1_flag");
        yhe0Var.f198332u = br3Var.m103445f("SPS: constraint_set_2_flag");
        yhe0Var.f198333v = br3Var.m103445f("SPS: constraint_set_3_flag");
        yhe0Var.f198334w = br3Var.m103445f("SPS: constraint_set_4_flag");
        yhe0Var.f198335x = br3Var.m103445f("SPS: constraint_set_5_flag");
        yhe0Var.f198329r = br3Var.m103446g(2, "SPS: reserved_zero_2bits");
        yhe0Var.f198336y = (int) br3Var.m103446g(8, "SPS: level_idc");
        yhe0Var.f198337z = br3Var.m103450l("SPS: seq_parameter_set_id");
        int i = yhe0Var.f198328q;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            m35 m35VarM152834a = m35.m152834a(br3Var.m103450l("SPS: chroma_format_idc"));
            yhe0Var.f198320i = m35VarM152834a;
            if (m35VarM152834a == m35.f131016g) {
                yhe0Var.f198297A = br3Var.m103445f("SPS: residual_color_transform_flag");
            }
            yhe0Var.f198325n = br3Var.m103450l("SPS: bit_depth_luma_minus8");
            yhe0Var.f198326o = br3Var.m103450l("SPS: bit_depth_chroma_minus8");
            yhe0Var.f198327p = br3Var.m103445f("SPS: qpprime_y_zero_transform_bypass_flag");
            if (br3Var.m103445f("SPS: seq_scaling_matrix_present_lag")) {
                m214819d(br3Var, yhe0Var);
            }
        } else {
            yhe0Var.f198320i = m35.f131014e;
        }
        yhe0Var.f198321j = br3Var.m103450l("SPS: log2_max_frame_num_minus4");
        int iM103450l = br3Var.m103450l("SPS: pic_order_cnt_type");
        yhe0Var.f198312a = iM103450l;
        if (iM103450l == 0) {
            yhe0Var.f198322k = br3Var.m103450l("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (iM103450l == 1) {
            yhe0Var.f198314c = br3Var.m103445f("SPS: delta_pic_order_always_zero_flag");
            yhe0Var.f198298B = br3Var.m103447h("SPS: offset_for_non_ref_pic");
            yhe0Var.f198299C = br3Var.m103447h("SPS: offset_for_top_to_bottom_field");
            int iM103450l2 = br3Var.m103450l("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            yhe0Var.f198311O = iM103450l2;
            yhe0Var.f198308L = new int[iM103450l2];
            for (int i2 = 0; i2 < yhe0Var.f198311O; i2++) {
                yhe0Var.f198308L[i2] = br3Var.m103447h("SPS: offsetForRefFrame [" + i2 + Constants.AES_SUFFIX);
            }
        }
        yhe0Var.f198300D = br3Var.m103450l("SPS: num_ref_frames");
        yhe0Var.f198301E = br3Var.m103445f("SPS: gaps_in_frame_num_value_allowed_flag");
        yhe0Var.f198324m = br3Var.m103450l("SPS: pic_width_in_mbs_minus1");
        yhe0Var.f198323l = br3Var.m103450l("SPS: pic_height_in_map_units_minus1");
        boolean zM103445f = br3Var.m103445f("SPS: frame_mbs_only_flag");
        yhe0Var.f198302F = zM103445f;
        if (!zM103445f) {
            yhe0Var.f198318g = br3Var.m103445f("SPS: mb_adaptive_frame_field_flag");
        }
        yhe0Var.f198319h = br3Var.m103445f("SPS: direct_8x8_inference_flag");
        boolean zM103445f2 = br3Var.m103445f("SPS: frame_cropping_flag");
        yhe0Var.f198303G = zM103445f2;
        if (zM103445f2) {
            yhe0Var.f198304H = br3Var.m103450l("SPS: frame_crop_left_offset");
            yhe0Var.f198305I = br3Var.m103450l("SPS: frame_crop_right_offset");
            yhe0Var.f198306J = br3Var.m103450l("SPS: frame_crop_top_offset");
            yhe0Var.f198307K = br3Var.m103450l("SPS: frame_crop_bottom_offset");
        }
        if (br3Var.m103445f("SPS: vui_parameters_present_flag")) {
            yhe0Var.f198309M = m214816a(br3Var);
        }
        br3Var.m103448i();
        return yhe0Var;
    }

    /* JADX INFO: renamed from: c */
    private static puk m214818c(br3 br3Var) throws IOException {
        puk pukVar = new puk();
        pukVar.f151300a = br3Var.m103450l("SPS: cpb_cnt_minus1");
        pukVar.f151301b = (int) br3Var.m103446g(4, "HRD: bit_rate_scale");
        pukVar.f151302c = (int) br3Var.m103446g(4, "HRD: cpb_size_scale");
        int i = pukVar.f151300a;
        pukVar.f151303d = new int[i + 1];
        pukVar.f151304e = new int[i + 1];
        pukVar.f151305f = new boolean[i + 1];
        for (int i2 = 0; i2 <= pukVar.f151300a; i2++) {
            pukVar.f151303d[i2] = br3Var.m103450l("HRD: bit_rate_value_minus1");
            pukVar.f151304e[i2] = br3Var.m103450l("HRD: cpb_size_value_minus1");
            pukVar.f151305f[i2] = br3Var.m103445f("HRD: cbr_flag");
        }
        pukVar.f151306g = (int) br3Var.m103446g(5, "HRD: initial_cpb_removal_delay_length_minus1");
        pukVar.f151307h = (int) br3Var.m103446g(5, "HRD: cpb_removal_delay_length_minus1");
        pukVar.f151308i = (int) br3Var.m103446g(5, "HRD: dpb_output_delay_length_minus1");
        pukVar.f151309j = (int) br3Var.m103446g(5, "HRD: time_offset_length");
        return pukVar;
    }

    /* JADX INFO: renamed from: d */
    private static void m214819d(br3 br3Var, yhe0 yhe0Var) throws IOException {
        yhe0Var.f198310N = new dtd0();
        for (int i = 0; i < 8; i++) {
            if (br3Var.m103445f("SPS: seqScalingListPresentFlag")) {
                dtd0 dtd0Var = yhe0Var.f198310N;
                ctd0[] ctd0VarArr = new ctd0[8];
                dtd0Var.f87831a = ctd0VarArr;
                ctd0[] ctd0VarArr2 = new ctd0[8];
                dtd0Var.f87832b = ctd0VarArr2;
                if (i < 6) {
                    ctd0VarArr[i] = ctd0.m108668a(br3Var, 16);
                } else {
                    ctd0VarArr2[i - 6] = ctd0.m108668a(br3Var, 64);
                }
            }
        }
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f198312a + ", \n        field_pic_flag=" + this.f198313b + ", \n        delta_pic_order_always_zero_flag=" + this.f198314c + ", \n        weighted_pred_flag=" + this.f198315d + ", \n        weighted_bipred_idc=" + this.f198316e + ", \n        entropy_coding_mode_flag=" + this.f198317f + ", \n        mb_adaptive_frame_field_flag=" + this.f198318g + ", \n        direct_8x8_inference_flag=" + this.f198319h + ", \n        chroma_format_idc=" + this.f198320i + ", \n        log2_max_frame_num_minus4=" + this.f198321j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f198322k + ", \n        pic_height_in_map_units_minus1=" + this.f198323l + ", \n        pic_width_in_mbs_minus1=" + this.f198324m + ", \n        bit_depth_luma_minus8=" + this.f198325n + ", \n        bit_depth_chroma_minus8=" + this.f198326o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f198327p + ", \n        profile_idc=" + this.f198328q + ", \n        constraint_set_0_flag=" + this.f198330s + ", \n        constraint_set_1_flag=" + this.f198331t + ", \n        constraint_set_2_flag=" + this.f198332u + ", \n        constraint_set_3_flag=" + this.f198333v + ", \n        constraint_set_4_flag=" + this.f198334w + ", \n        constraint_set_5_flag=" + this.f198335x + ", \n        level_idc=" + this.f198336y + ", \n        seq_parameter_set_id=" + this.f198337z + ", \n        residual_color_transform_flag=" + this.f198297A + ", \n        offset_for_non_ref_pic=" + this.f198298B + ", \n        offset_for_top_to_bottom_field=" + this.f198299C + ", \n        num_ref_frames=" + this.f198300D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.f198301E + ", \n        frame_mbs_only_flag=" + this.f198302F + ", \n        frame_cropping_flag=" + this.f198303G + ", \n        frame_crop_left_offset=" + this.f198304H + ", \n        frame_crop_right_offset=" + this.f198305I + ", \n        frame_crop_top_offset=" + this.f198306J + ", \n        frame_crop_bottom_offset=" + this.f198307K + ", \n        offsetForRefFrame=" + this.f198308L + ", \n        vuiParams=" + this.f198309M + ", \n        scalingMatrix=" + this.f198310N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.f198311O + '}';
    }
}
