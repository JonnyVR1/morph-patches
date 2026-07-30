package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes2.dex */
public class StateEvent {

    public static class ActionValue {
        public static final String CAMERA_FOCUS = "need_focus";
        public static final String LIVE_DATA_CB = "live_data_cb";
        public static final String NET_REQ = "network_request";
        public static final String OCR_CARD_NOT_FOUND = "card_not_found";
        public static final String OCR_MANUAL_ON = "ocr_start_manual_mode";
        public static final String OCR_VIID_FINISH = "ocr_viid_finish";
        public static final String OCR_VIID_LEFTDOWN = "ocr_viid_leftdown";
        public static final String OCR_VIID_NORMAL = "ocr_viid_normal";
        public static final String OCR_VIID_RESET = "ocr_viid_reset";
        public static final String OCR_VIID_RIGHTUP = "ocr_viid_rightup";
        public static final String PROCESS_FIN = "process_finished";
        public static final String RESET_CUSTOM_TIMEOUT = "reset_custom_timeout";
        public static final String STAGE_NOTPASS = "not_pass";
        public static final String STAGE_PASS = "pass";
        public static final String TIMEOUT_COUNTDOWN_BEGIN = "timeout_count_begin";
        public static final String UI_NUMBER_UPDATE = "ui_number_update";
    }

    public static class Name {
        public static final String ACTION_DATA_S = "action_data_s";
        public static final String ACTION_DETECT_DONE_LAST_COUNT = "action_detect_done_last_count";
        public static final String ACTION_DETECT_DONE_TYPE = "action_detect_done_type";
        public static final String ACTION_DETECT_TYPE = "action_detect_type";
        public static final String BEST_FACE_IMAGE = "face_best_image";
        public static final String CMP_MESSAGE = "cmp_message";
        public static final String CMP_SCORE = "cmp_score";
        public static final String CONSERVATION_VIDEO_MESSAGE = "CONSERVATION_VIDEO_MESSAGE";
        public static final String COUNTDOWN_TIME = "countdown_time";
        public static final String ERROR_CODE = "error_code";
        public static final String ERROR_REASON_CODE = "error_reason_code";
        public static final String EXTRA_MESSAGE = "extra_message";
        public static final String FSM_STATE_PAUSE = "fsm_state_pause";
        public static final String LIVE_MODE_REFLECTION_OPEN = "live_mode_reflection_open";
        public static final String MESSAGE = "message";
        public static final String OPERATE_CATCH_ERROR = "operate_catch_error";
        public static final String OPERATE_PACK_USE_TIME = "operate_pack_use_time";
        public static final String PROCESS_RESULT = "process_action";
        public static final String SELECT_DATA_S = "select_data_s";
        public static final String STATE_STATS = "state_stats";
        public static final String UI_ACTION = "ui_action";
        public static final String UI_EXTRA_TIPS = "ui_extra_tips";
        public static final String UI_TIPS = "ui_tips";
        public static final String WARNING_TIPS = "version_tips";
    }

    public static class ProcessResult {
        public static final String FAILED = "failed";
        public static final String SUCCEED = "succeed";
    }
}
