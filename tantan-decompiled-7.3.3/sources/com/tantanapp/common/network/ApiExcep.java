package com.tantanapp.common.network;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import p153l.i5d0;
import p153l.x1d0;

/* JADX INFO: loaded from: classes11.dex */
public class ApiExcep extends RuntimeException {
    public i5d0 response;

    public static class ClientExpired extends ApiExcep {
        public ClientExpired(i5d0 i5d0Var) {
            super(i5d0Var, "client expired");
        }
    }

    public static class ParseError extends ApiExcep {
        public ParseError(i5d0 i5d0Var, Exception exc, String str) {
            super(i5d0Var, str.replace('\n', ' ') + "\n\n\n" + exc.getMessage());
        }
    }

    public static class RequestCancelled extends ApiExcep {
        public RequestCancelled(i5d0 i5d0Var) {
            super(i5d0Var, "request cancelled");
        }
    }

    public static class Server extends ApiExcep {
        public Server(i5d0 i5d0Var) {
            super(i5d0Var, "internal server error");
        }
    }

    public static class UploadedMediaNotFound extends ApiExcep {
        public UploadedMediaNotFound(i5d0 i5d0Var) {
            super(i5d0Var, "uploaded media not found");
        }
    }

    public ApiExcep(i5d0 i5d0Var, String str) {
        super(getMessage(i5d0Var, str));
        this.response = i5d0Var;
    }

    public static String getMessage(i5d0 i5d0Var, String str) {
        String str2 = null;
        x1d0 x1d0VarM138668Z = i5d0Var == null ? null : i5d0Var.m138668Z();
        if (x1d0VarM138668Z != null) {
            str2 = x1d0VarM138668Z.m209022g() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + x1d0VarM138668Z.m209026k();
        }
        if (str2 == null) {
            return str;
        }
        return str + " :: " + str2;
    }

    public static class Client extends ApiExcep {

        public static class Conflict extends Client {
            public Conflict(i5d0 i5d0Var) {
                super(i5d0Var, "conflict");
            }
        }

        public static class Forbidden extends Client {
            public Forbidden(i5d0 i5d0Var) {
                super(i5d0Var, "forbidden");
            }
        }

        public static class Gone extends Client {
            public Gone(i5d0 i5d0Var) {
                super(i5d0Var, "gone");
            }
        }

        public static class ImATeapot extends Client {
            public ImATeapot(i5d0 i5d0Var) {
                super(i5d0Var, "hahahah !!!!");
            }
        }

        public static class MethodNotAllowed extends Client {
            public MethodNotAllowed(i5d0 i5d0Var) {
                super(i5d0Var, "method not allowed");
            }
        }

        public static class NotFound extends Client {
            public NotFound(i5d0 i5d0Var) {
                super(i5d0Var, "not found");
            }
        }

        public static class RequestEntityTooLarge extends Client {
            public RequestEntityTooLarge(i5d0 i5d0Var) {
                super(i5d0Var, "entity too large");
            }
        }

        public static class TooManyRequests extends Client {
            public final int resetInSeconds;

            public TooManyRequests(i5d0 i5d0Var, int i) {
                super(i5d0Var, "too many requests. reset in " + i);
                this.resetInSeconds = i;
            }
        }

        public static class Unauthorized extends Client {
            public Unauthorized(i5d0 i5d0Var) {
                super(i5d0Var, "unauthorized");
            }
        }

        public static class UnprocessableEntity extends Client {
            public UnprocessableEntity(i5d0 i5d0Var) {
                super(i5d0Var, "unprocessable entity");
            }
        }

        public static class UnsupportedMediaType extends Client {
            public UnsupportedMediaType(i5d0 i5d0Var) {
                super(i5d0Var, "unsupportd media type");
            }
        }

        public Client(i5d0 i5d0Var, String str) {
            super(i5d0Var, str);
        }

        public static class BadRequest extends Client {
            public BadRequest(i5d0 i5d0Var) {
                super(i5d0Var, "bad request");
            }

            public BadRequest(i5d0 i5d0Var, String str) {
                super(i5d0Var, str);
            }
        }
    }
}
