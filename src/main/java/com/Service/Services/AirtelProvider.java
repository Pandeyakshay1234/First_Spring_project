package com.Service.Services;

public class AirtelProvider {

        private ServiceProvide ServeService;

        public void setServeService(ServiceProvide serveService) {

            this.ServeService = serveService;
        }

        public void GiveService()
        {
            ServeService.serve();

        }
    }


